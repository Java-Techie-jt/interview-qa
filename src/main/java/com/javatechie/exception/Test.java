package com.javatechie.exception;

public class Test {


    public void getOrder(int orderId) throws OrderNotFoundException {
        if(orderId==101){
            throw new OrderNotFoundException("Order not found with id "+orderId);
        }else{
            //do some logic
        }
    }


    public static void main(String[] args) throws OrderNotFoundException {
        Test test=new Test();
        test.getOrder(101);
    }
}
