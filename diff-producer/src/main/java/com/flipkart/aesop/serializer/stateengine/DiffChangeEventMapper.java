/*
 * Copyright 2012-2015, the original author or authors.
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
package com.flipkart.aesop.serializer.stateengine;

import java.util.List;

import org.apache.avro.generic.GenericRecord;

import com.netflix.zeno.diff.TypeDiff;

/**
 * The <code>DiffChangeEventMapper</code> maps information contained in the Zeno {@link TypeDiff} to Databus change events of type {@link GenericRecord}.
 * 
 * @author Regunath B
 * @version 1.0, 19 March 2014
 */

public interface DiffChangeEventMapper<T, S extends GenericRecord> {
	
	/**
	 * Maps data contained in the specified TypeDiff result into change events.
	 * @param typeDiff the TypeDiff to create change events from
	 * @return List of change events
	 */
	public List<S> getChangeEvents(TypeDiff<T> typeDiff);
}