package com.javatechie.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CustomThread extends Thread {

    static Map<Integer, String> map = new HashMap<Integer, String>();

    public void run() {
        try {
            Thread.sleep(1000);
            // Child thread trying to add
            // new element in the object
            map.put(103, "D");
        } catch (InterruptedException e) {
            System.out.println("Child Thread going to add element");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        map.put(100, "A");
        map.put(101, "B");
        map.put(102, "C");

        CustomThread customThread = new CustomThread();
        customThread.start();

        //main thread is iterating
        for (Object o : map.entrySet()) {
            Object s = o;
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(map);
    }
    //Segment locking or bucket locking
}
