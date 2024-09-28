package com.johurulIslam.main.collectionframwork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer>myArray=new ArrayList<>();
        myArray.add(1);
        myArray.add(5);
        myArray.add(3);
        myArray.add(2,10);
        myArray.remove(2);
        myArray.add(2,15);
        myArray.set(2,15);
        Integer s=myArray.size();
        System.out.println(s);
        boolean n= myArray.contains(15);
        System.out.println(n);
        System.out.println(myArray.get(2));
        System.out.println("index= "+myArray.get(2));
        Collections.sort(myArray);
        printArray(myArray);
        myArray.clear();
    }
    public static void printArray(ArrayList<Integer>mAray){
        for (Integer i : mAray) {
            System.out.println(i);
        }
    }
}
