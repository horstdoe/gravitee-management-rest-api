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

import io.gravitee.definition.jackson.model.NewTeamEntity;
import io.gravitee.definition.jackson.model.TeamEntity;
import io.gravitee.definition.jackson.model.UpdateTeamEntity;

import java.util.Optional;
import java.util.Set;

/**
 * @author David BRASSELY (brasseld at gmail.com)
 */
public interface TeamService {

    Optional<TeamEntity> findByName(String teamName);

    TeamEntity create(NewTeamEntity team, String owner);

    TeamEntity update(String teamName, UpdateTeamEntity team);

    Set<TeamEntity> findByUser(String username, boolean publicOnly);

    Set<TeamEntity> findAll(boolean publicOnly);
}
