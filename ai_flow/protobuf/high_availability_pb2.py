#
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

# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: high_availability.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import service as _service
from google.protobuf import service_reflection
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='high_availability.proto',
  package='ai_flow',
  syntax='proto3',
  serialized_options=b'\n\027org.aiflow.client.protoZ\010/ai_flow\210\001\001\220\001\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x17high_availability.proto\x12\x07\x61i_flow\"G\n\x0bMemberProto\x12\x0f\n\x07version\x18\x01 \x01(\x03\x12\x12\n\nserver_uri\x18\x02 \x01(\t\x12\x13\n\x0bupdate_time\x18\x03 \x01(\x03\"-\n\x12ListMembersRequest\x12\x17\n\x0ftimeout_seconds\x18\x01 \x01(\x05\"|\n\x13ListMembersResponse\x12*\n\x0breturn_code\x18\x01 \x01(\x0e\x32\x15.ai_flow.ReturnStatus\x12\x12\n\nreturn_msg\x18\x02 \x01(\t\x12%\n\x07members\x18\x03 \x03(\x0b\x32\x14.ai_flow.MemberProto\">\n\x16NotifyNewMemberRequest\x12$\n\x06member\x18\x01 \x01(\x0b\x32\x14.ai_flow.MemberProto\"Y\n\x17NotifyNewMemberResponse\x12*\n\x0breturn_code\x18\x01 \x01(\x0e\x32\x15.ai_flow.ReturnStatus\x12\x12\n\nreturn_msg\x18\x02 \x01(\t*0\n\x0cReturnStatus\x12\x10\n\x0c\x43\x41LL_SUCCESS\x10\x00\x12\x0e\n\nCALL_ERROR\x10\x01\x32\xbd\x01\n\x17HighAvailabilityManager\x12J\n\x0blistMembers\x12\x1b.ai_flow.ListMembersRequest\x1a\x1c.ai_flow.ListMembersResponse\"\x00\x12V\n\x0fnotifyNewMember\x12\x1f.ai_flow.NotifyNewMemberRequest\x1a .ai_flow.NotifyNewMemberResponse\"\x00\x42)\n\x17org.aiflow.client.protoZ\x08/ai_flow\x88\x01\x01\x90\x01\x01\x62\x06proto3'
)

_RETURNSTATUS = _descriptor.EnumDescriptor(
  name='ReturnStatus',
  full_name='ai_flow.ReturnStatus',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='CALL_SUCCESS', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CALL_ERROR', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=437,
  serialized_end=485,
)
_sym_db.RegisterEnumDescriptor(_RETURNSTATUS)

ReturnStatus = enum_type_wrapper.EnumTypeWrapper(_RETURNSTATUS)
CALL_SUCCESS = 0
CALL_ERROR = 1



_MEMBERPROTO = _descriptor.Descriptor(
  name='MemberProto',
  full_name='ai_flow.MemberProto',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='version', full_name='ai_flow.MemberProto.version', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='server_uri', full_name='ai_flow.MemberProto.server_uri', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='ai_flow.MemberProto.update_time', index=2,
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
  serialized_start=36,
  serialized_end=107,
)


_LISTMEMBERSREQUEST = _descriptor.Descriptor(
  name='ListMembersRequest',
  full_name='ai_flow.ListMembersRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='timeout_seconds', full_name='ai_flow.ListMembersRequest.timeout_seconds', index=0,
      number=1, type=5, cpp_type=1, label=1,
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
  serialized_start=109,
  serialized_end=154,
)


_LISTMEMBERSRESPONSE = _descriptor.Descriptor(
  name='ListMembersResponse',
  full_name='ai_flow.ListMembersResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='return_code', full_name='ai_flow.ListMembersResponse.return_code', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='return_msg', full_name='ai_flow.ListMembersResponse.return_msg', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='members', full_name='ai_flow.ListMembersResponse.members', index=2,
      number=3, type=11, cpp_type=10, label=3,
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
  serialized_start=156,
  serialized_end=280,
)


_NOTIFYNEWMEMBERREQUEST = _descriptor.Descriptor(
  name='NotifyNewMemberRequest',
  full_name='ai_flow.NotifyNewMemberRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='member', full_name='ai_flow.NotifyNewMemberRequest.member', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
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
  serialized_start=282,
  serialized_end=344,
)


_NOTIFYNEWMEMBERRESPONSE = _descriptor.Descriptor(
  name='NotifyNewMemberResponse',
  full_name='ai_flow.NotifyNewMemberResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='return_code', full_name='ai_flow.NotifyNewMemberResponse.return_code', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='return_msg', full_name='ai_flow.NotifyNewMemberResponse.return_msg', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=346,
  serialized_end=435,
)

_LISTMEMBERSRESPONSE.fields_by_name['return_code'].enum_type = _RETURNSTATUS
_LISTMEMBERSRESPONSE.fields_by_name['members'].message_type = _MEMBERPROTO
_NOTIFYNEWMEMBERREQUEST.fields_by_name['member'].message_type = _MEMBERPROTO
_NOTIFYNEWMEMBERRESPONSE.fields_by_name['return_code'].enum_type = _RETURNSTATUS
DESCRIPTOR.message_types_by_name['MemberProto'] = _MEMBERPROTO
DESCRIPTOR.message_types_by_name['ListMembersRequest'] = _LISTMEMBERSREQUEST
DESCRIPTOR.message_types_by_name['ListMembersResponse'] = _LISTMEMBERSRESPONSE
DESCRIPTOR.message_types_by_name['NotifyNewMemberRequest'] = _NOTIFYNEWMEMBERREQUEST
DESCRIPTOR.message_types_by_name['NotifyNewMemberResponse'] = _NOTIFYNEWMEMBERRESPONSE
DESCRIPTOR.enum_types_by_name['ReturnStatus'] = _RETURNSTATUS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

MemberProto = _reflection.GeneratedProtocolMessageType('MemberProto', (_message.Message,), {
  'DESCRIPTOR' : _MEMBERPROTO,
  '__module__' : 'high_availability_pb2'
  # @@protoc_insertion_point(class_scope:ai_flow.MemberProto)
  })
_sym_db.RegisterMessage(MemberProto)

ListMembersRequest = _reflection.GeneratedProtocolMessageType('ListMembersRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTMEMBERSREQUEST,
  '__module__' : 'high_availability_pb2'
  # @@protoc_insertion_point(class_scope:ai_flow.ListMembersRequest)
  })
_sym_db.RegisterMessage(ListMembersRequest)

ListMembersResponse = _reflection.GeneratedProtocolMessageType('ListMembersResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTMEMBERSRESPONSE,
  '__module__' : 'high_availability_pb2'
  # @@protoc_insertion_point(class_scope:ai_flow.ListMembersResponse)
  })
_sym_db.RegisterMessage(ListMembersResponse)

NotifyNewMemberRequest = _reflection.GeneratedProtocolMessageType('NotifyNewMemberRequest', (_message.Message,), {
  'DESCRIPTOR' : _NOTIFYNEWMEMBERREQUEST,
  '__module__' : 'high_availability_pb2'
  # @@protoc_insertion_point(class_scope:ai_flow.NotifyNewMemberRequest)
  })
_sym_db.RegisterMessage(NotifyNewMemberRequest)

NotifyNewMemberResponse = _reflection.GeneratedProtocolMessageType('NotifyNewMemberResponse', (_message.Message,), {
  'DESCRIPTOR' : _NOTIFYNEWMEMBERRESPONSE,
  '__module__' : 'high_availability_pb2'
  # @@protoc_insertion_point(class_scope:ai_flow.NotifyNewMemberResponse)
  })
_sym_db.RegisterMessage(NotifyNewMemberResponse)


DESCRIPTOR._options = None

_HIGHAVAILABILITYMANAGER = _descriptor.ServiceDescriptor(
  name='HighAvailabilityManager',
  full_name='ai_flow.HighAvailabilityManager',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=488,
  serialized_end=677,
  methods=[
  _descriptor.MethodDescriptor(
    name='listMembers',
    full_name='ai_flow.HighAvailabilityManager.listMembers',
    index=0,
    containing_service=None,
    input_type=_LISTMEMBERSREQUEST,
    output_type=_LISTMEMBERSRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='notifyNewMember',
    full_name='ai_flow.HighAvailabilityManager.notifyNewMember',
    index=1,
    containing_service=None,
    input_type=_NOTIFYNEWMEMBERREQUEST,
    output_type=_NOTIFYNEWMEMBERRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_HIGHAVAILABILITYMANAGER)

DESCRIPTOR.services_by_name['HighAvailabilityManager'] = _HIGHAVAILABILITYMANAGER

HighAvailabilityManager = service_reflection.GeneratedServiceType('HighAvailabilityManager', (_service.Service,), dict(
  DESCRIPTOR = _HIGHAVAILABILITYMANAGER,
  __module__ = 'high_availability_pb2'
  ))

HighAvailabilityManager_Stub = service_reflection.GeneratedServiceStubType('HighAvailabilityManager_Stub', (HighAvailabilityManager,), dict(
  DESCRIPTOR = _HIGHAVAILABILITYMANAGER,
  __module__ = 'high_availability_pb2'
  ))


# @@protoc_insertion_point(module_scope)
