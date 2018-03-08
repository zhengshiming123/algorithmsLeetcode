package com.example.test;

/**
 * Created by h on 2018/3/8.
 */
public class Test01 {

    public static void main(String[] args) {

        byte a = 127;
        byte b = 127;
        //a = a + b;
        a += b;
        a =(byte) 254;
        System.out.println(a);
    }
}
