package com.example.algorithms.Array;

/**
 * Created by h on 2018/3/9.
 * 买卖股票的最佳时机
 */
public class Array121 {
    public static void main(String[] args) {
        Array121 array121 = new Array121();
        //int i = array121.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        int i = array121.maxProfit1(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(i);
    }

    public int maxProfit1(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length ; i++) {
            if (prices[i] > min) {
                max = Math.max(prices[i] - min,max);
            } else {
                min = prices[i];
            }

        }
        return max;
    }
    public int maxProfit(int[] prices) {
        int num = 0;
        for (int i = 0; i < prices.length; i++) {
            int low = i+1;
            int hei = prices.length - 1;
            num = Math.max(getnum(prices, low, hei, 0) - prices[i], num);
        }
        return num;
    }

    public int getnum(int[] prices, int low, int hei,int num) {

        int mid = (low + hei) / 2;
        num = Math.max(prices[mid], num);
        if (low <= hei) {
            //int getnum1 = getnum(prices, low, mid - 1, num);
            num = Math.max(getnum(prices, mid + 1, hei, num), num);
            return Math.max(getnum(prices, low, mid - 1, num), num);
        } else {
            return 0;
        }

    }

}
