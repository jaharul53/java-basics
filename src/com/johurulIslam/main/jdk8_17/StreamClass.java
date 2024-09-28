package com.johurulIslam.main.jdk8_17;

import java.util.ArrayList;
import java.util.List;

public class StreamClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        List<Integer>filterList= arrayList.stream().filter((num)->num%2==0).toList();
        System.out.println(filterList);


    }
}
