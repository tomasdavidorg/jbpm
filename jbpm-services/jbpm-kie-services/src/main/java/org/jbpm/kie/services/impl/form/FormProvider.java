/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.kie.services.impl.form;

import java.util.Map;
import org.jbpm.kie.services.impl.FormManagerService;

import org.jbpm.services.api.model.ProcessDefinition;
import org.kie.api.task.model.Task;

public interface FormProvider {

    int getPriority();

    String render(String name, ProcessDefinition process, Map<String, Object> renderContext);

    String render(String name, Task task, ProcessDefinition process, Map<String, Object> renderContext);
    
    void setFormManagerService(FormManagerService formManagerService);
}