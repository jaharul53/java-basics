package com.johurulIslam.main.collectionframwork;

import java.util.Collections;
import java.util.LinkedList;

public class LinkListClass {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkList= new LinkedList<Integer>();
        integerLinkList.add(1);
        integerLinkList.add(2);
        System.out.println(integerLinkList);
        integerLinkList.addFirst(5);
        integerLinkList.addLast(20);
        Integer first = integerLinkList.getFirst();
        System.out.println(first);
        System.out.println(integerLinkList);
        integerLinkList.removeFirst();
        integerLinkList.removeFirst();
        System.out.println(integerLinkList);
        Collections.sort(integerLinkList);
        System.out.println(integerLinkList);
    }
}
