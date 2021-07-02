package com.javatechie.exception;

import java.io.*;

public class DataReader {

    public static void main(String[] args) {

        File file=new File("C:\\Users\\basan\\Onerive\\Desktop\\jasypt-cmd");

        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            while(br.readLine()!=null){
                System.out.println(br.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
