package com.javatechie.exception;

public class ExceptionOrder {


    public static void main(String[] args) {

        try {
            System.out.println(10 / 0);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
//       } catch (ArithmeticException ae) {
//            System.out.println(ae.getMessage());
//        } finally {
            System.out.println("finally");
        }
    }
}
