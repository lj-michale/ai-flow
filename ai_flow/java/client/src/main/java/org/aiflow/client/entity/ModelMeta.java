/*
 * Copyright 2022 The AI Flow Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.aiflow.client.entity;

import org.aiflow.client.proto.Message.ModelProto;

public class ModelMeta {

    private Long uuid;
    private String modelDesc;
    private String name;
    private Long projectId;

    public ModelMeta() {}

    public ModelMeta(Long uuid, String modelDesc, String name, Long projectId) {
        this.uuid = uuid;
        this.modelDesc = modelDesc;
        this.name = name;
        this.projectId = projectId;
    }

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getModelDesc() {
        return modelDesc;
    }

    public void setModelDesc(String modelDesc) {
        this.modelDesc = modelDesc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "ModelMeta{"
                + "uuid="
                + uuid
                + ", modelDesc='"
                + modelDesc
                + '\''
                + ", name='"
                + name
                + '\''
                + ", projectId="
                + projectId
                + '}';
    }

    public static ModelMeta buildModelMeta(ModelProto modelProto) {
        return modelProto == null
                ? null
                : new ModelMeta(
                        modelProto.getUuid(),
                        modelProto.getModelDesc().getValue(),
                        modelProto.getName(),
                        modelProto.getProjectId().getValue());
    }
}
