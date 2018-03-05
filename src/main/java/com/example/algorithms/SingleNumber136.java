package com.example.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by h on 2018/3/2.
 * 只出现一次的数字
 */
public class SingleNumber136 {

    public static void main(String[] args) {
        SingleNumber136 number = new SingleNumber136();
        int i = number.singleNumber(new int[]{1, 1, 2, 3, 2});
        System.out.println(i);
    }
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int d = 1;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.remove(nums[i]);
            } else {
                map.put(nums[i], i);
            }
        }
        for (int num : nums) {
            if (map.containsKey(num)) {
                Integer integer = map.get(num);
                d = num;
            } else {

            }
        }
        for (Integer key : map.keySet()) {
            Integer integer = map.get(key);
        }

        int result = 0;
        for (Integer num : nums) {
            result ^= num;
        }
        System.out.println("result == " + result);
        return d;
    }
}
