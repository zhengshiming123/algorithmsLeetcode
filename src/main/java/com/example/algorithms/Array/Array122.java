package com.example.algorithms.Array;

/**
 * Created by h on 2018/3/9.
 */
public class Array122 {
    public static void main(String[] args) {
        Array122 array122 = new Array122();
        int i = array122.maxProfit(new int[]{1,4,2});
        System.out.println(i);
    }
    public int maxProfit1(int[] prices) {

        if (prices.length == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i + 1] > prices[i]) {
                result +=prices[i + 1] - prices[i];
            }
        }
        return result;
    }

    public int maxProfit(int[] prices) {

        int maxNum = 0;
        int num = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length ; i++) {

            if (prices[i] > prices[i-1]) {
                num = prices[i] - min;
            } else {
                maxNum += num;
                num = 0;
                min = prices[i];
            }
        }
        return maxNum+num;
    }
}
