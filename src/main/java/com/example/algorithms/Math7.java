package com.example.algorithms;

/**
 * Created by h on 2018/3/2.
 */
public class Math7 {

    public static void main(String[] args) {

        Math7 math7 = new Math7();
        int i = math7.reverse1(123);
        int i3 = math7.reverse3(123);
        System.out.println(i);
        System.out.println(i3);
    }
    public int reverse3(int x) {
        int result = 0;

        if (x != 0) {
            int i = reverse3(x / 10);
            result = i*10 + x % 10;
        }
        return result;

    }

    public int reverse1(int x) {

        int result = 0;
        while (x != 0) {
            int num = x % 10;
            int newNum = result * 10 + num;
            if (newNum / 10 != result) {
                return 0;
            }
            result = newNum;
            x = x / 10;
        }
        return result;

    }

    public int reverse(int x) {

        String a = String.valueOf(x);
        //StringBuilder builder = (StringBuilder)a;
        int length = a.length()-1;
        int i=0;
        while (i<=length/2) {
            char b = a.charAt(i);
            char c = a.charAt(length - i);
            char temp = 0;
            temp = b;
            b = c;
            c = temp;
            i++;

        }
        return Integer.parseInt(a);
    }
}
