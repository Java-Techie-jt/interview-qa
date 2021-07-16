package com.javatechie.collection;

import java.util.ArrayList;
import java.util.List;

public class FinalListExample {

    public static void main(String[] args) {

       final List<String> list=new ArrayList<>();

        System.out.println(list);

        list.add("abc");
        list.add("def");

    }
}
