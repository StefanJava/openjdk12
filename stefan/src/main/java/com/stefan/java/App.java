package com.stefan.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            map.put(i + 1 + "", "a");
        }
        map.remove("3");
    }
}
