package com.example.algorithms;

/**
 * Created by h on 2018/3/1.
 */
public class MaximumSubarray53 {
    public static void main(String[] args) {
        MaximumSubarray53 max = new MaximumSubarray53();
        max.maxSubArray(new int[]{-1});
    }

    public int maxSubArray(int[] nums) {
        int max =Integer.MIN_VALUE;
        int sum = 0;
        for( int i = 0;i<nums.length;i++){

            if(sum<0){
                sum= nums[i];
            }else{
                sum = sum + nums[i];
            }
            if( sum >max){
                max = sum;
            }
        }
        return max;
    }
}
