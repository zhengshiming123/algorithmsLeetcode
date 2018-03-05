package com.example.algorithms;

/**
 * Created by h on 2018/2/27.
 * 回文编号
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean palindrome = palindromeNumber.isPalindrome(232);
        System.out.println(palindrome);
    }
    public boolean isPalindrome(int x) {

        if (x == 0 || x / 10 == 0) {
            return false;
        }
        int a = 0;
        int b = x;
        while (b > 0) {
            a = a * 10 + b % 10;
            b = b / 10;
        }
        if (a == x) {
            return true;
        }
        return false;
    }
}
