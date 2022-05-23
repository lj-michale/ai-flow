# Copyright 2022 The AI Flow Authors
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#   http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
import logging
import os
import unittest
from unittest import mock

import daemon

import ai_flow.settings
from ai_flow.cli import cli_parser
from ai_flow.cli.commands import webserver_command

logger = logging.getLogger(__name__)


class TestCliServer(unittest.TestCase):
    @classmethod
    def setUpClass(cls):
        cls.parser = cli_parser.get_parser()

    def test_cli_webserver_start(self):
        aiflow_home = os.path.join(os.path.dirname(__file__), "..")
        ai_flow.settings.AIFLOW_HOME = aiflow_home
        with mock.patch.object(webserver_command, "start_web_server_by_config_file_path") as start_web_server:
            webserver_command.webserver_start(self.parser.parse_args(['webserver', 'start']))
            start_web_server.assert_called_once_with(
                os.path.join(aiflow_home, "aiflow_server.yaml"))

            self.assertFalse(os.path.exists(os.path.join(aiflow_home, ai_flow.settings.AIFLOW_PID_FILENAME)))

    def test_cli_webserver_start_daemon(self):
        aiflow_home = os.path.join(os.path.dirname(__file__), "..")
        ai_flow.settings.AIFLOW_HOME = aiflow_home
        with mock.patch.object(daemon, "DaemonContext") as DaemonContext, \
                mock.patch.object(webserver_command, "start_web_server_by_config_file_path") as start_web_server:
            DaemonContext.side_effect = mock.MagicMock()

            with self.assertLogs("ai_flow.cli.commands.webserver_command", "INFO") as log:
                webserver_command.webserver_start(self.parser.parse_args(['webserver', 'start', '-d']))

            DaemonContext.assert_called_once()
            log_output = "\n".join(log.output)
            self.assertIn("Starting AIFlow Webserver in daemon mode", log_output)
            self.assertIn("AIFlow Webserver log:", log_output)
            self.assertIn("AIFlow Webserver pid file:", log_output)
            start_web_server.assert_called_once_with(os.path.join(aiflow_home, "aiflow_server.yaml"))

    def test_cli_server_start_twice(self):
        aiflow_home = os.path.join(os.path.dirname(__file__), "..")
        ai_flow.settings.AIFLOW_HOME = aiflow_home
        pid_file_path = os.path.join(aiflow_home,
                                     ai_flow.settings.AIFLOW_WEBSERVER_PID_FILENAME)
        try:
            open(pid_file_path, 'a').close()
            with self.assertLogs("ai_flow.cli.commands.webserver_command", "INFO") as log:
                webserver_command.webserver_start(self.parser.parse_args(['webserver', 'start']))
            self.assertIn('Web Server is running', str(log.output))
        finally:
            os.remove(pid_file_path)

    def test_cli_server_start_twice(self):
        aiflow_home = os.path.join(os.path.dirname(__file__), "..")
        ai_flow.settings.AIFLOW_HOME = aiflow_home
        pid_file_path = os.path.join(aiflow_home,
                                     ai_flow.settings.AIFLOW_WEBSERVER_PID_FILENAME)
        with self.assertLogs("ai_flow", "INFO") as log, TmpPidFile(pid_file_path), \
                mock.patch.object(daemon, "DaemonContext") as DaemonContext, \
                mock.patch.object(webserver_command, "start_web_server_by_config_file_path"):
            DaemonContext.side_effect = mock.MagicMock()
            with mock.patch.object(webserver_command, "check_pid_exist") as mock_check_pid_exist:
                mock_check_pid_exist.return_value = False
                webserver_command.webserver_start(self.parser.parse_args(['webserver', 'start']))
            self.assertIn('This means a staled PID file', str(log.output))

        with self.assertLogs("ai_flow", "INFO") as log, TmpPidFile(pid_file_path), \
                mock.patch.object(daemon, "DaemonContext") as DaemonContext, \
                mock.patch.object(webserver_command, "start_web_server_by_config_file_path"):
            DaemonContext.side_effect = mock.MagicMock()
            with mock.patch.object(webserver_command, "check_pid_exist") as mock_check_pid_exist2:
                mock_check_pid_exist2.return_value = True
                webserver_command.webserver_start(self.parser.parse_args(['webserver', 'start']))
            self.assertIn('Web Server is running', str(log.output))

    def test_cli_webserver_stop_without_pid_file(self):
        aiflow_home = os.path.join(os.path.dirname(__file__), "..")
        ai_flow.settings.AIFLOW_HOME = aiflow_home

        with self.assertLogs("ai_flow.cli.commands.webserver_command", "INFO") as log:
            webserver_command.webserver_stop(self.parser.parse_args(['webserver', 'stop']))
            log_output = "\n".join(log.output)
            self.assertIn("PID file of AIFlow Webserver does not exist at", log_output)

    def test_cli_webserver_stop_with_staled_pid_file(self):
        aiflow_home = os.path.join(os.path.dirname(__file__), "..")
        ai_flow.settings.AIFLOW_HOME = aiflow_home
        pid_file = os.path.join(aiflow_home, ai_flow.settings.AIFLOW_WEBSERVER_PID_FILENAME)

        with self.assertLogs("ai_flow", "INFO") as log, TmpPidFile(pid_file), \
                mock.patch.object(webserver_command, "check_pid_exist") as mock_check_pid_exist:
            mock_check_pid_exist.return_value = False
            webserver_command.webserver_stop(self.parser.parse_args(['webserver', 'stop']))
            log_output = "\n".join(log.output)
            self.assertIn("This means a staled PID file.", log_output)
            self.assertFalse(os.path.exists(pid_file))

    def test_cli_webserver_stop(self):
        aiflow_home = os.path.join(os.path.dirname(__file__), "..")
        ai_flow.settings.AIFLOW_HOME = aiflow_home
        pid_file = os.path.join(aiflow_home, ai_flow.settings.AIFLOW_WEBSERVER_PID_FILENAME)
        with TmpPidFile(pid_file), mock.patch.object(webserver_command, "stop_process") as mock_stop_process, \
                mock.patch.object(webserver_command, "check_pid_exist") as mock_check_pid_exist:
            mock_check_pid_exist.return_value = True
            webserver_command.webserver_stop(self.parser.parse_args(['webserver', 'stop']))
            mock_stop_process.assert_called_with(15213, "AIFlow Webserver")


class TmpPidFile:
    def __init__(self, pid_file_path, pid: int = 15213):
        self.pid_file_path = pid_file_path
        self.pid = pid

    def __enter__(self):
        with open(self.pid_file_path, 'w') as f:
            f.write(str(self.pid))

    def __exit__(self, exc_type, exc_val, exc_tb):
        if os.path.exists(self.pid_file_path):
            os.remove(self.pid_file_path)
