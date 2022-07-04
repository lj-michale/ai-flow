#
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
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

# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: metadata_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import service as _service
from google.protobuf import service_reflection
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from . import message_pb2 as message__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='metadata_service.proto',
  package='ai_flow',
  syntax='proto3',
  serialized_options=b'\n\027org.aiflow.client.protoZ\010/ai_flow\210\001\001\220\001\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x16metadata_service.proto\x12\x07\x61i_flow\x1a\rmessage.proto\x1a\x1cgoogle/api/annotations.proto\"A\n\x12NamespaceListProto\x12+\n\nnamespaces\x18\x01 \x03(\x0b\x32\x17.ai_flow.NamespaceProto\"V\n\x1cListWorkflowSnapshotsRequest\x12\x13\n\x0bworkflow_id\x18\x01 \x01(\x03\x12\x11\n\tpage_size\x18\x02 \x01(\x03\x12\x0e\n\x06offset\x18\x03 \x01(\x03\"W\n\x19WorkflowSnapshotListProto\x12:\n\x12workflow_snapshots\x18\x01 \x03(\x0b\x32\x1e.ai_flow.WorkflowSnapshotProto2\xd3\x07\n\x0fMetadataService\x12^\n\x0c\x61\x64\x64Namespace\x12\x17.ai_flow.NamespaceProto\x1a\x11.ai_flow.Response\"\"\x82\xd3\xe4\x93\x02\x1c\"\x17/metadata/namespace/add:\x01*\x12_\n\x0cgetNamespace\x12\x14.ai_flow.NameRequest\x1a\x11.ai_flow.Response\"&\x82\xd3\xe4\x93\x02 \x12\x1e/metadata/namespace/get/{name}\x12\x64\n\x0fupdateNamespace\x12\x17.ai_flow.NamespaceProto\x1a\x11.ai_flow.Response\"%\x82\xd3\xe4\x93\x02\x1f\"\x1a/metadata/namespace/update:\x01*\x12^\n\x0elistNamespaces\x12\x14.ai_flow.ListRequest\x1a\x11.ai_flow.Response\"#\x82\xd3\xe4\x93\x02\x1d\"\x18/metadata/namespace/list:\x01*\x12\x65\n\x0f\x64\x65leteNamespace\x12\x14.ai_flow.NameRequest\x1a\x11.ai_flow.Response\")\x82\xd3\xe4\x93\x02#\x12!/metadata/namespace/delete/{name}\x12t\n\x13\x61\x64\x64WorkflowSnapshot\x12\x1e.ai_flow.WorkflowSnapshotProto\x1a\x11.ai_flow.Response\"*\x82\xd3\xe4\x93\x02$\"\x1f/metadata/workflow_snapshot/add:\x01*\x12j\n\x13getWorkflowSnapshot\x12\x12.ai_flow.IdRequest\x1a\x11.ai_flow.Response\",\x82\xd3\xe4\x93\x02&\x12$/metadata/workflow_snapshot/get/{id}\x12~\n\x15listWorkflowSnapshots\x12%.ai_flow.ListWorkflowSnapshotsRequest\x1a\x11.ai_flow.Response\"+\x82\xd3\xe4\x93\x02%\" /metadata/workflow_snapshot/list:\x01*\x12p\n\x16\x64\x65leteWorkflowSnapshot\x12\x12.ai_flow.IdRequest\x1a\x11.ai_flow.Response\"/\x82\xd3\xe4\x93\x02)\x12\'/metadata/workflow_snapshot/delete/{id}B)\n\x17org.aiflow.client.protoZ\x08/ai_flow\x88\x01\x01\x90\x01\x01\x62\x06proto3'
  ,
  dependencies=[message__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_NAMESPACELISTPROTO = _descriptor.Descriptor(
  name='NamespaceListProto',
  full_name='ai_flow.NamespaceListProto',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='namespaces', full_name='ai_flow.NamespaceListProto.namespaces', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=80,
  serialized_end=145,
)


_LISTWORKFLOWSNAPSHOTSREQUEST = _descriptor.Descriptor(
  name='ListWorkflowSnapshotsRequest',
  full_name='ai_flow.ListWorkflowSnapshotsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='workflow_id', full_name='ai_flow.ListWorkflowSnapshotsRequest.workflow_id', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='ai_flow.ListWorkflowSnapshotsRequest.page_size', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='offset', full_name='ai_flow.ListWorkflowSnapshotsRequest.offset', index=2,
      number=3, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=147,
  serialized_end=233,
)


_WORKFLOWSNAPSHOTLISTPROTO = _descriptor.Descriptor(
  name='WorkflowSnapshotListProto',
  full_name='ai_flow.WorkflowSnapshotListProto',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='workflow_snapshots', full_name='ai_flow.WorkflowSnapshotListProto.workflow_snapshots', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=235,
  serialized_end=322,
)

_NAMESPACELISTPROTO.fields_by_name['namespaces'].message_type = message__pb2._NAMESPACEPROTO
_WORKFLOWSNAPSHOTLISTPROTO.fields_by_name['workflow_snapshots'].message_type = message__pb2._WORKFLOWSNAPSHOTPROTO
DESCRIPTOR.message_types_by_name['NamespaceListProto'] = _NAMESPACELISTPROTO
DESCRIPTOR.message_types_by_name['ListWorkflowSnapshotsRequest'] = _LISTWORKFLOWSNAPSHOTSREQUEST
DESCRIPTOR.message_types_by_name['WorkflowSnapshotListProto'] = _WORKFLOWSNAPSHOTLISTPROTO
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

NamespaceListProto = _reflection.GeneratedProtocolMessageType('NamespaceListProto', (_message.Message,), {
  'DESCRIPTOR' : _NAMESPACELISTPROTO,
  '__module__' : 'metadata_service_pb2'
  # @@protoc_insertion_point(class_scope:ai_flow.NamespaceListProto)
  })
_sym_db.RegisterMessage(NamespaceListProto)

ListWorkflowSnapshotsRequest = _reflection.GeneratedProtocolMessageType('ListWorkflowSnapshotsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTWORKFLOWSNAPSHOTSREQUEST,
  '__module__' : 'metadata_service_pb2'
  # @@protoc_insertion_point(class_scope:ai_flow.ListWorkflowSnapshotsRequest)
  })
_sym_db.RegisterMessage(ListWorkflowSnapshotsRequest)

WorkflowSnapshotListProto = _reflection.GeneratedProtocolMessageType('WorkflowSnapshotListProto', (_message.Message,), {
  'DESCRIPTOR' : _WORKFLOWSNAPSHOTLISTPROTO,
  '__module__' : 'metadata_service_pb2'
  # @@protoc_insertion_point(class_scope:ai_flow.WorkflowSnapshotListProto)
  })
_sym_db.RegisterMessage(WorkflowSnapshotListProto)


DESCRIPTOR._options = None

_METADATASERVICE = _descriptor.ServiceDescriptor(
  name='MetadataService',
  full_name='ai_flow.MetadataService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=325,
  serialized_end=1304,
  methods=[
  _descriptor.MethodDescriptor(
    name='addNamespace',
    full_name='ai_flow.MetadataService.addNamespace',
    index=0,
    containing_service=None,
    input_type=message__pb2._NAMESPACEPROTO,
    output_type=message__pb2._RESPONSE,
    serialized_options=b'\202\323\344\223\002\034\"\027/metadata/namespace/add:\001*',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='getNamespace',
    full_name='ai_flow.MetadataService.getNamespace',
    index=1,
    containing_service=None,
    input_type=message__pb2._NAMEREQUEST,
    output_type=message__pb2._RESPONSE,
    serialized_options=b'\202\323\344\223\002 \022\036/metadata/namespace/get/{name}',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='updateNamespace',
    full_name='ai_flow.MetadataService.updateNamespace',
    index=2,
    containing_service=None,
    input_type=message__pb2._NAMESPACEPROTO,
    output_type=message__pb2._RESPONSE,
    serialized_options=b'\202\323\344\223\002\037\"\032/metadata/namespace/update:\001*',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='listNamespaces',
    full_name='ai_flow.MetadataService.listNamespaces',
    index=3,
    containing_service=None,
    input_type=message__pb2._LISTREQUEST,
    output_type=message__pb2._RESPONSE,
    serialized_options=b'\202\323\344\223\002\035\"\030/metadata/namespace/list:\001*',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='deleteNamespace',
    full_name='ai_flow.MetadataService.deleteNamespace',
    index=4,
    containing_service=None,
    input_type=message__pb2._NAMEREQUEST,
    output_type=message__pb2._RESPONSE,
    serialized_options=b'\202\323\344\223\002#\022!/metadata/namespace/delete/{name}',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='addWorkflowSnapshot',
    full_name='ai_flow.MetadataService.addWorkflowSnapshot',
    index=5,
    containing_service=None,
    input_type=message__pb2._WORKFLOWSNAPSHOTPROTO,
    output_type=message__pb2._RESPONSE,
    serialized_options=b'\202\323\344\223\002$\"\037/metadata/workflow_snapshot/add:\001*',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='getWorkflowSnapshot',
    full_name='ai_flow.MetadataService.getWorkflowSnapshot',
    index=6,
    containing_service=None,
    input_type=message__pb2._IDREQUEST,
    output_type=message__pb2._RESPONSE,
    serialized_options=b'\202\323\344\223\002&\022$/metadata/workflow_snapshot/get/{id}',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='listWorkflowSnapshots',
    full_name='ai_flow.MetadataService.listWorkflowSnapshots',
    index=7,
    containing_service=None,
    input_type=_LISTWORKFLOWSNAPSHOTSREQUEST,
    output_type=message__pb2._RESPONSE,
    serialized_options=b'\202\323\344\223\002%\" /metadata/workflow_snapshot/list:\001*',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='deleteWorkflowSnapshot',
    full_name='ai_flow.MetadataService.deleteWorkflowSnapshot',
    index=8,
    containing_service=None,
    input_type=message__pb2._IDREQUEST,
    output_type=message__pb2._RESPONSE,
    serialized_options=b'\202\323\344\223\002)\022\'/metadata/workflow_snapshot/delete/{id}',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_METADATASERVICE)

DESCRIPTOR.services_by_name['MetadataService'] = _METADATASERVICE

MetadataService = service_reflection.GeneratedServiceType('MetadataService', (_service.Service,), dict(
  DESCRIPTOR = _METADATASERVICE,
  __module__ = 'metadata_service_pb2'
  ))

MetadataService_Stub = service_reflection.GeneratedServiceStubType('MetadataService_Stub', (MetadataService,), dict(
  DESCRIPTOR = _METADATASERVICE,
  __module__ = 'metadata_service_pb2'
  ))


# @@protoc_insertion_point(module_scope)