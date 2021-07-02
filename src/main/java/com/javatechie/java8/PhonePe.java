package com.javatechie.java8;

public class PhonePe implements Payment {

    @Override
    public void doTransaction() {
        System.out.println("PhonePe transaction");
    }

    @Override
    public void addCoupon() {
        System.out.println("10% cachback");
    }
}
