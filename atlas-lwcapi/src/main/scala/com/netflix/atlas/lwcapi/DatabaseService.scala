/*
 * Copyright 2014-2016 Netflix, Inc.
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
package com.netflix.atlas.lwcapi

import javax.inject.Singleton

import com.netflix.iep.service.{AbstractService, State}
import com.typesafe.scalalogging.StrictLogging

@Singleton
class DatabaseService extends AbstractService with StrictLogging {
  @volatile private var started = false

  def setState(value: Boolean): Unit = started = value

  override def isHealthy: Boolean = state == State.RUNNING && started

  override def startImpl(): Unit = {}

  override def stopImpl(): Unit = {}
}
