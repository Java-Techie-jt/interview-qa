package com.javatechie.fundamentals;

public class TestImmutableString {

    public static void main(String[] args) {
        String s="Java";//-------1010
        s.concat(" Techie");//---------1020
        //concat() method appends the string at the end
        System.out.println(s);//will print Java because strings are immutable objects

        String password="pwd";
        password.concat("123");


        StringBuilder sb=new StringBuilder("Java");
        sb.append(" Techie");
        System.out.println(sb);

        //let's say 5 reference using this password ,
        // now if we changed any in same value then all 5 reference will impacted
    }
}
