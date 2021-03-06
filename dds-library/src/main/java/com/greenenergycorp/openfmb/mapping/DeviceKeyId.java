/**
 * Copyright 2015 Green Energy Corp.
 *
 * Licensed to Green Energy Corp (www.greenenergycorp.com) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. Green Energy
 * Corp licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.greenenergycorp.openfmb.mapping;

/**
 * ID of an OpenFMB key update (DDS struct field) for a particular mapped device.
 */
public class DeviceKeyId {
    private final String deviceName;
    private final String key;

    /**
     *
     * @param deviceName Device name from mapping configuration.
     * @param key Name of the key, i.e. the field name of a DDS struct.
     */
    public DeviceKeyId(String deviceName, String key) {
        this.deviceName = deviceName;
        this.key = key;
    }

    /**
     * @return Device name from mapping configuration.
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * @return Name of the key, i.e. the field name of a DDS struct.
     */
    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "ValueId(" + deviceName + ", " + key + ")";
    }
}
