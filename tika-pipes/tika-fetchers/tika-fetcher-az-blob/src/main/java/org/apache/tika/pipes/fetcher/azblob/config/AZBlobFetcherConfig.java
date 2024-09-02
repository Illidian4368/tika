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
package org.apache.tika.pipes.fetcher.azblob.config;

import org.apache.tika.pipes.fetcher.config.FetcherConfig;

public class AZBlobFetcherConfig extends FetcherConfig {

    public static final String PLUGIN_ID = "az-blob-fetcher";

    @Override
    public String getFetcherPluginId() {
        return PLUGIN_ID;
    }

    private boolean spoolToTemp;
    private String sasToken;
    private String endpoint;
    private String container;
    private boolean extractUserMetadata;

    public boolean isSpoolToTemp() {
        return spoolToTemp;
    }

    public AZBlobFetcherConfig setSpoolToTemp(boolean spoolToTemp) {
        this.spoolToTemp = spoolToTemp;
        return this;
    }

    public String getSasToken() {
        return sasToken;
    }

    public AZBlobFetcherConfig setSasToken(String sasToken) {
        this.sasToken = sasToken;
        return this;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public AZBlobFetcherConfig setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public String getContainer() {
        return container;
    }

    public AZBlobFetcherConfig setContainer(String container) {
        this.container = container;
        return this;
    }

    public boolean isExtractUserMetadata() {
        return extractUserMetadata;
    }

    public AZBlobFetcherConfig setExtractUserMetadata(boolean extractUserMetadata) {
        this.extractUserMetadata = extractUserMetadata;
        return this;
    }
}
