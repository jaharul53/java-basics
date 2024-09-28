package com.johurulIslam.main.collectionframwork;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String,Object> myHashMap = new HashMap<String,Object>();
        myHashMap.put("10", "Johurul");
        myHashMap.put("15", "Johurul");
        myHashMap.put("18", "Johurul");
        System.out.println(myHashMap);
        printHashMap(myHashMap);
        Object ob = myHashMap.get("10");
        System.out.println(ob);
        myHashMap.remove("10");
        HashMap<String,Object> anotherHashMap = new HashMap<>();
        anotherHashMap.putAll(myHashMap);
        System.out.println(anotherHashMap);
    }
    public static void printHashMap(HashMap<String,Object> myHashMap) {
        for(Map.Entry<String,Object> entry : myHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
