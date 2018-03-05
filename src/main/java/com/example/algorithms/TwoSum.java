package com.example.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by h on 2018/2/26.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 18;
        TwoSum twoSumC = new TwoSum();
        int[] ints = twoSumC.twoSum3(nums, target);
        System.out.println(ints);
    }

    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }else{
                    continue;
                }

            }
        }
        return null;
    }

    public int[] twoSum1(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }else{
                    continue;
                }

            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map myMap = new HashMap();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++){
            if (myMap.containsKey(nums[i])){
                //result[0] = myMap.get(nums[i]);
                result[1] = i;
                break;
            }
            else myMap.put((target - nums[i]), i);
        }

        return result;
    }

    public int[] twoSum3(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }



}
