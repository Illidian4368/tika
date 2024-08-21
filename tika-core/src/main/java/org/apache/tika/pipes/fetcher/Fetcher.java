/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tika.pipes.fetcher;

import java.io.IOException;
import java.io.InputStream;

import org.pf4j.ExtensionPoint;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;

/**
 * Interface for an object that will fetch an InputStream given
 * a fetch string.  This will also update the metadata object
 * based on the fetch.
 * <p>
 * Implementations of Fetcher must be thread safe.
 */
public interface Fetcher extends ExtensionPoint {

    String getPluginId();

    InputStream fetch(String fetchKey, Metadata metadata, ParseContext parseContext) throws TikaException, IOException;
}
