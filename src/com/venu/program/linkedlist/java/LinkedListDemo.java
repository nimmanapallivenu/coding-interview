package com.venu.program.linkedlist.java;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("value1");
        linkedList.add("value2");

        System.out.println(" LinkedList Get 1 :\t "+linkedList.get(1));

        for(String v:linkedList){
            System.out.println(v);
        }
    }
}
