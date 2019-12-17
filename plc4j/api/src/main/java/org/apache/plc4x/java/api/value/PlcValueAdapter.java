/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.plc4x.java.api.value;

import org.apache.plc4x.java.api.exceptions.PlcIncompatibleDatatypeException;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PlcValueAdapter implements PlcValue {

    @Override public boolean isSimple() {
        return false;
    }

    @Override public boolean isNullable() {
        return false;
    }

    @Override public boolean isNull() {
        return false;
    }

    @Override public boolean is(Class<?> clazz) {
        return false;
    }

    @Override public boolean isConvertibleTo(Class<?> clazz) {
        return false;
    }

    @Override public <T> T get(Class<T> clazz) {
        throw new PlcIncompatibleDatatypeException("");
    }

    @Override public boolean isBoolean() {
        return false;
    }

    @Override public boolean getBoolean() {
        throw new PlcIncompatibleDatatypeException("");
    }

    @Override public boolean isDouble() {
        return false;
    }

    @Override public double getDouble() {
        throw new PlcIncompatibleDatatypeException("");
    }

    @Override public boolean isFloat() {
        return false;
    }

    @Override public float getFloat() {
        throw new PlcIncompatibleDatatypeException("");
    }

    @Override public boolean isLong() {
        return false;
    }

    @Override public long getLong() {
        throw new PlcIncompatibleDatatypeException("");
    }

    @Override public boolean isInteger() {
        return false;
    }

    @Override public int getInteger() {
        throw new PlcIncompatibleDatatypeException("");
    }

    @Override public boolean isString() {
        return false;
    }

    @Override public String getString() {
        throw new PlcIncompatibleDatatypeException("");
    }

    @Override public byte[] getRaw() {
        throw new PlcIncompatibleDatatypeException("");
    }

    @Override public boolean isList() {
        return false;
    }

    @Override public int length() {
        throw new PlcIncompatibleDatatypeException("");
    }

    @Override public PlcValue getIndex(int i) {
        throw new PlcIncompatibleDatatypeException("");
    }

    @Override public List<? extends PlcValue> getList() {
        throw new PlcIncompatibleDatatypeException("");
    }

    @Override public boolean isStruct() {
        return false;
    }

    @Override public Set<String> getKeys() {
        throw new PlcIncompatibleDatatypeException("");
    }

    @Override public boolean hasKey(String key) {
        return false;
    }

    @Override public PlcValue getValue(String key) {
        throw new PlcIncompatibleDatatypeException("");
    }

    @Override public Map<String, ? extends PlcValue> getStruct() {
        throw new PlcIncompatibleDatatypeException("");
    }

}
