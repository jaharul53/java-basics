package com.johurulIslam.main.collectionframwork;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> hashSet= new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(-1);
        System.out.println(hashSet);

    }
}
