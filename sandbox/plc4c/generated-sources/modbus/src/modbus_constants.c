/*
  Licensed to the Apache Software Foundation (ASF) under one
  or more contributor license agreements.  See the NOTICE file
  distributed with this work for additional information
  regarding copyright ownership.  The ASF licenses this file
  to you under the Apache License, Version 2.0 (the
  "License"); you may not use this file except in compliance
  with the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing,
  software distributed under the License is distributed on an
  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
  KIND, either express or implied.  See the License for the
  specific language governing permissions and limitations
  under the License.
*/

#include <stdio.h>
#include <plc4c/spi/read_buffer.h>
#include <plc4c/spi/write_buffer.h>
#include <plc4c/spi/evaluation_helper.h>
#include "modbus_constants.h"

// Parse function.
plc4c_return_code plc4c_modbus_read_write_modbus_constants_parse(plc4c_spi_read_buffer* buf, plc4c_modbus_read_write_modbus_constants** _message) {
  uint16_t startPos = plc4c_spi_read_get_pos(buf);
  uint16_t curPos;

  // Allocate enough memory to contain this data structure.
  (*_message) = malloc(sizeof(plc4c_modbus_read_write_modbus_constants));
  if(*_message == NULL) {
    return NO_MEMORY;
  }

  // Const Field (modbusTcpDefaultPort)
  uint16_t modbusTcpDefaultPort = plc4c_spi_read_unsigned_int(buf, 16);
  if(modbusTcpDefaultPort != MODBUS_READ_WRITE_MODBUS_CONSTANTS_MODBUS_TCP_DEFAULT_PORT) {
    return PARSE_ERROR;
    // throw new ParseException("Expected constant value " + MODBUS_READ_WRITE_MODBUS_CONSTANTS_MODBUS_TCP_DEFAULT_PORT + " but got " + modbusTcpDefaultPort);
  }

  return OK;
}

plc4c_return_code plc4c_modbus_read_write_modbus_constants_serialize(plc4c_spi_write_buffer* buf, plc4c_modbus_read_write_modbus_constants* _message) {

  // Const Field (modbusTcpDefaultPort)
  plc4c_spi_write_unsigned_int(buf, 16, MODBUS_READ_WRITE_MODBUS_CONSTANTS_MODBUS_TCP_DEFAULT_PORT);

  return OK;
}

uint8_t plc4c_modbus_read_write_modbus_constants_length_in_bytes(plc4c_modbus_read_write_modbus_constants* _message) {
  return plc4c_modbus_read_write_modbus_constants_length_in_bits(_message) / 8;
}

uint8_t plc4c_modbus_read_write_modbus_constants_length_in_bits(plc4c_modbus_read_write_modbus_constants* _message) {
  uint8_t lengthInBits = 0;

  // Const Field (modbusTcpDefaultPort)
  lengthInBits += 16;

  return lengthInBits;
}

