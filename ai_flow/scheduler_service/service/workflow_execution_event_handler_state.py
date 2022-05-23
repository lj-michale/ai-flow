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
from typing import Text, Any, Optional


class WorkflowContextEventHandlerState:

    def __init__(self,
                 project_name: Text,
                 workflow_name: Text,
                 context: Text,
                 workflow_execution_id: Optional[Text] = None,
                 state: Optional[Any] = None):
        self.project_name = project_name
        self.workflow_name = workflow_name
        self.context = context
        self.workflow_execution_id = workflow_execution_id
        self.state = state
