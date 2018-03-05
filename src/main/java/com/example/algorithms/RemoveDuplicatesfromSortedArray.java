package com.example.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by h on 2018/3/1.
 * 从排序数组中删除重复项
 */
public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray removeDuplicatesfromSortedArray = new RemoveDuplicatesfromSortedArray();
        //removeDuplicatesfromSortedArray.removeDuplicates(new int[]{1, 1, 2});
        removeDuplicatesfromSortedArray.removeDuplicates1(new int[]{1, 1, 2});
    }
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (Integer a : map.keySet()) {
            System.out.println(a);
        }
        return map.size();
    }

    public int removeDuplicates1(int[] nums) {
        int d = 1;
        if (nums.length < 2) {
            return nums.length;
        }
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[d++] = nums[i];
            }
        }
        return d;
    }
}
