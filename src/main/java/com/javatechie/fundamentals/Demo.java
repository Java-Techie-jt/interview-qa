package com.javatechie.fundamentals;

public class Demo {

    private final int a=10;

    public void m1(){
        //a=20;//can't reassign
        try {
            System.out.println("try block");
        }finally {
            System.out.println("finally block");
            //clean those stream
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method called...");
    }

    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.m1();
        //demo=null;
        System.gc();
    }
}
