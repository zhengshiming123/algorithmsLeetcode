package com.example.algorithms;

/**
 * Created by h on 2018/3/1.
 */
public class RemoveElement27 {

    public static void main(String[] args) {


    }
    public int removeElement(int[] nums, int val) {

        int d = 0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] != val) {
                nums[d++] = nums[i];
            }
        }
        return d;
    }
}
