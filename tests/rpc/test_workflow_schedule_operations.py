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
#
from unittest import mock

import cloudpickle
from grpc._channel import _InactiveRpcError

from ai_flow.common.exception.exceptions import AIFlowException
from ai_flow.model.operators.bash import BashOperator
from ai_flow.model.workflow import Workflow
from ai_flow.rpc.client.aiflow_client import get_ai_flow_client
from ai_flow.rpc.server.server import AIFlowServer
from tests.test_utils.mock_utils import MockNotificationClient, MockTimer
from tests.test_utils.unittest_base import BaseUnitTest


class TestWorkflowScheduleOperations(BaseUnitTest):
    def setUp(self) -> None:
        super().setUp()
        with mock.patch("ai_flow.task_executor.common.task_executor_base.HeartbeatManager"):
            with mock.patch('ai_flow.rpc.service.scheduler_service.EmbeddedNotificationClient', MockNotificationClient):
                with mock.patch('ai_flow.rpc.service.scheduler_service.Timer', MockTimer):
                    self.server = AIFlowServer()
                    self.server.run(is_block=False)
        self.client = get_ai_flow_client()
        self.timer = self.server.scheduler_service.timer
        self.workflow_meta = self.prepare_workflow()

    def tearDown(self) -> None:
        self.server.stop()
        super().tearDown()

    def prepare_workflow(self):
        self.client.add_namespace('default')
        with Workflow(name='workflow1') as workflow:
            BashOperator(name='bash', bash_command='echo 1')
        workflow_meta = self.client.add_workflow(workflow.name, 'default', 'mock_content', cloudpickle.dumps(workflow))
        return workflow_meta

    def test_add_workflow_schedule(self):
        schedule = self.client.add_workflow_schedule(namespace=self.workflow_meta.namespace,
                                                     workflow_name=self.workflow_meta.name,
                                                     expression='cron@*/1 * * * * * * utc')
        self.assertEqual(1, schedule.id)
        self.assertEqual(self.workflow_meta.id, schedule.workflow_id)
        self.assertFalse(schedule.is_paused)
        self.assertEqual('cron@*/1 * * * * * * utc', schedule.expression)
        self.assertIsNotNone(schedule.create_time)
        self.assertEqual(1, len(self.timer.schedules))
        self.assertEqual('active', self.timer.schedules[schedule.id])

    def test_add_invalid_workflow_schedule(self):
        with self.assertRaises(_InactiveRpcError):
            self.client.add_workflow_schedule(namespace=self.workflow_meta.namespace,
                                              workflow_name=self.workflow_meta.name,
                                              expression='invalid')
        self.assertIsNone(self.client.list_workflow_executions(
            namespace=self.workflow_meta.namespace, workflow_name=self.workflow_meta.name))

    def test_get_workflow_schedule(self):
        schedule = self.client.add_workflow_schedule(namespace=self.workflow_meta.namespace,
                                                     workflow_name=self.workflow_meta.name,
                                                     expression='cron@*/1 * * * * * * utc')
        retrieved_schedule = self.client.get_workflow_schedule(schedule.id)
        self.assertEqual(schedule.id, retrieved_schedule.id)
        self.assertEqual(schedule.workflow_id, retrieved_schedule.workflow_id)
        self.assertEqual(schedule.is_paused, retrieved_schedule.is_paused)
        self.assertEqual(schedule.expression, retrieved_schedule.expression)
        self.assertEqual(schedule.create_time, retrieved_schedule.create_time)

    def test_get_non_exists_workflow_schedule(self):
        self.assertIsNone(self.client.get_workflow_schedule(101))

    def test_list_non_exists_workflow_schedules(self):
        with self.assertRaisesRegex(AIFlowException, r'Workflow invalid.invalid not exists'):
            self.client.list_workflow_executions('invalid', 'invalid')

    def test_list_workflow_schedules(self):
        self.client.add_workflow_schedule(namespace=self.workflow_meta.namespace,
                                          workflow_name=self.workflow_meta.name,
                                          expression='cron@*/1 * * * * * * utc')
        self.client.add_workflow_schedule(namespace=self.workflow_meta.namespace,
                                          workflow_name=self.workflow_meta.name,
                                          expression='cron@*/2 * * * * * * utc')
        schedules = self.client.list_workflow_schedules(self.workflow_meta.namespace, self.workflow_meta.name)
        self.assertEqual(2, len(schedules))
        self.assertEqual('cron@*/1 * * * * * * utc', schedules[0].expression)
        self.assertEqual('cron@*/2 * * * * * * utc', schedules[1].expression)

        second = self.client.list_workflow_schedules(self.workflow_meta.namespace, self.workflow_meta.name,
                                                     page_size=1, offset=1)[0]
        self.assertEqual('cron@*/2 * * * * * * utc', second.expression)

    def test_delete_workflow_schedule(self):
        schedule = self.client.add_workflow_schedule(namespace=self.workflow_meta.namespace,
                                                     workflow_name=self.workflow_meta.name,
                                                     expression='cron@*/1 * * * * * * utc')
        self.assertEqual(1, len(self.client.list_workflow_schedules(self.workflow_meta.namespace,
                                                                    self.workflow_meta.name)))
        self.assertEqual(1, len(self.timer.schedules))
        self.assertTrue(self.client.delete_workflow_schedule(schedule.id))
        self.assertIsNone(self.client.list_workflow_schedules(self.workflow_meta.namespace,
                                                              self.workflow_meta.name))
        self.assertEqual(0, len(self.timer.schedules))

    def test_delete_non_exists_workflow_schedule(self):
        with self.assertRaisesRegex(AIFlowException, r"Workflow schedule 101 not exists"):
            self.client.delete_workflow_schedule(101)

    def test_delete_workflow_schedules(self):
        self.client.add_workflow_schedule(namespace=self.workflow_meta.namespace,
                                          workflow_name=self.workflow_meta.name,
                                          expression='cron@*/1 * * * * * * utc')
        self.client.add_workflow_schedule(namespace=self.workflow_meta.namespace,
                                          workflow_name=self.workflow_meta.name,
                                          expression='cron@*/2 * * * * * * utc')
        schedules = self.client.list_workflow_schedules(self.workflow_meta.namespace, self.workflow_meta.name)
        self.assertEqual(2, len(schedules))
        self.assertEqual(2, len(self.timer.schedules))
        self.client.delete_workflow_schedules(self.workflow_meta.namespace, self.workflow_meta.name)
        schedules = self.client.list_workflow_schedules(self.workflow_meta.namespace, self.workflow_meta.name)
        self.assertIsNone(schedules)
        self.assertEqual(0, len(self.timer.schedules))

    def test_rollback_deleting_workflow_schedule(self):
        schedule = self.client.add_workflow_schedule(namespace=self.workflow_meta.namespace,
                                                     workflow_name=self.workflow_meta.name,
                                                     expression='cron@*/1 * * * * * * utc')
        self.client.add_workflow_schedule(namespace=self.workflow_meta.namespace,
                                          workflow_name=self.workflow_meta.name,
                                          expression='cron@*/2 * * * * * * utc')
        self.timer.schedules.clear()
        with self.assertRaises(_InactiveRpcError):
            self.assertTrue(self.client.delete_workflow_schedule(schedule.id))
        self.assertEqual(2, len(self.client.list_workflow_schedules(namespace=self.workflow_meta.namespace,
                                                                    workflow_name=self.workflow_meta.name)))
        with self.assertRaises(_InactiveRpcError):
            self.assertTrue(self.client.delete_workflow_schedules(namespace=self.workflow_meta.namespace,
                                                                  workflow_name=self.workflow_meta.name))
        self.assertEqual(2, len(self.client.list_workflow_schedules(namespace=self.workflow_meta.namespace,
                                                                    workflow_name=self.workflow_meta.name)))

    def test_pause_and_resume_workflow_schedule(self):
        schedule = self.client.add_workflow_schedule(namespace=self.workflow_meta.namespace,
                                                     workflow_name=self.workflow_meta.name,
                                                     expression='cron@*/1 * * * * * * utc')
        self.assertFalse(schedule.is_paused)
        self.assertEqual('active', self.timer.schedules[schedule.id])

        self.client.pause_workflow_schedule(schedule_id=schedule.id)
        self.assertTrue(self.client.get_workflow_schedule(schedule.id).is_paused)
        self.assertEqual('paused', self.timer.schedules[schedule.id])

        self.client.resume_workflow_schedule(schedule_id=schedule.id)
        self.assertFalse(self.client.get_workflow_schedule(schedule.id).is_paused)
        self.assertEqual('active', self.timer.schedules[schedule.id])

    def test_pause_and_resume_non_exists_workflow_schedule(self):
        with self.assertRaisesRegex(AIFlowException, r"Workflow schedule 101 not exists"):
            self.client.pause_workflow_schedule(101)
        with self.assertRaisesRegex(AIFlowException, r"Workflow schedule 101 not exists"):
            self.client.resume_workflow_schedule(101)