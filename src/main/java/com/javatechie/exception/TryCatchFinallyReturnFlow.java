package com.javatechie.exception;

public class TryCatchFinallyReturnFlow {

    public static int m1() {
        try {
            return 1;
        } catch (Exception ex) {
            return 2;
        }finally {
            System.exit(0);
            return  3;
        }
    }

    public static void main(String[] args) {
        System.out.println(m1());
    }
}
