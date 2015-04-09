/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String MEASUREMENTS = "a495ff20-c5b1-4b44-b512-1370f02d74de";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    static {
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180f-0000-1000-8000-00805f9b34fb", "Battery Service");
        attributes.put("00002a01-0000-1000-8000-00805f9b34fb", "Appearance");
        attributes.put("00002a19-0000-1000-8000-00805f9b34fb", "Battery Level" );
        attributes.put("00002a1b-0000-1000-8000-00805f9b34fb", "Battery Level State" );
        attributes.put("00002a25-0000-1000-8000-00805f9b34fb", "Serial Number String");
        attributes.put("00002a26-0000-1000-8000-00805f9b34fb", "Firmware Revision String");
        attributes.put("00002a27-0000-1000-8000-00805f9b34fb", "Hardware Revision String");
        attributes.put("00002a28-0000-1000-8000-00805f9b34fb", "Software Revision String");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put("00002a38-0000-1000-8000-00805f9b34fb", "Body Sensor Location");
        attributes.put("00002a39-0000-1000-8000-00805f9b34fb", "Heart Rate Control Point");
        attributes.put("a495ff10-c5b1-4b44-b512-1370f02d74de", "Serial Service");
        attributes.put("a495ff11-c5b1-4b44-b512-1370f02d74de", "Bean Transport Characteristic");
        attributes.put("a495ff22-c5b1-4b44-b512-1370f02d74de", "Temperature Service");
        attributes.put(MEASUREMENTS, "Measurements");
        //http://www.spinics.net/lists/linux-bluetooth/msg31630.html



    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
