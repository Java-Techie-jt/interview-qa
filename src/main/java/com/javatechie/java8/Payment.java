package com.javatechie.java8;

public interface Payment {

    public void doTransaction();

    /**
     * ignore if you don't want to add any addCoupon features in any of your impl
     * directly access from super class , if you want to use same impl
     * @Override addCoupon method if you want to provide different impl
     * **/

    default void addCoupon() {
        System.out.println("add 5 RS cashback");
    }

    static void generateTransactionReport(){
        System.out.println("generate each transaction report");
    }
}
