/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.management.service;

import java.util.List;
import java.util.Optional;

import io.gravitee.definition.jackson.model.NewPageEntity;
import io.gravitee.definition.jackson.model.PageEntity;
import io.gravitee.definition.jackson.model.UpdatePageEntity;

/**
 * @author Titouan COMPIEGNE
 */
public interface DocumentationService {

	List<PageEntity> findByApiName(String apiName);
	
	Optional<PageEntity> findByName(String pageName);
	
	PageEntity createPage(NewPageEntity page);
	
	PageEntity updatePage(String pageName, UpdatePageEntity updatePageEntity);
	
	void deletePage(String pageName);
	
	int findMaxPageOrderByApiName(String apiName);
}
