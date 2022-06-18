package com.stefan.java.util;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            map.put(i + 1 + "", "a");
        }
        map.remove("3");
    }
}
