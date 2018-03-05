package com.example.algorithms;

/**
 * Created by h on 2018/3/5.
 */
public class Math172 {
    public static void main(String[] args) {


    }
    public int trailingZeroes(int n) {

        return n>0 ? trailingZeroes(n /5) +n/5 : 0;
    }
}
