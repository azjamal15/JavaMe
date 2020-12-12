package com.javafundamentals.datastructures;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hannah");
        map.put(2, "Jamil");
        map.put(3, "Alice");
        System.out.println(map);

        System.out.println(map.get(1));
        System.out.println(map.keySet());

        for (int key : map.keySet()) {
            System.out.println(map.get(key));
        }

        map.forEach((k, v) -> {
            System.out.println(k + " - " + v);
        });

        String orDefault = map.getOrDefault(10, "oops, cannot find this key!");
        System.out.println(orDefault);



    }
}
