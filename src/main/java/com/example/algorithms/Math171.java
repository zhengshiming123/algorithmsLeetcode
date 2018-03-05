package com.example.algorithms;

/**
 * Created by h on 2018/3/5.
 */
public class Math171 {

    public static void main(String[] args) {

        String s = "BA";
        Math171 math171 = new Math171();
        int i = math171.titleToNumber(s);
        System.out.println(i);
    }
    public int titleToNumber(String s) {

        int length = s.length() - 1;
        int a = 0;
        //int num = 0;
        //while (a <= length) {
        //    int i = s.charAt(a++) - 'A' + 1;
        //    num = num * 26 + i;
        //}
        //return num;

        System.out.println(s);
        return s.length()!=0 ? titleToNumber(s.substring(0,s.length()-1))*26+(s.charAt(s.length()-1)-'A'+1) : 0;

    }

}
