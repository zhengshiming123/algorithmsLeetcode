package com.example.algorithms.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by h on 2018/3/8.
 */
public class Array4 {

    public static void main(String[] args) {
        Array4 array4 = new Array4();
        double medianSortedArrays = array4.findMedianSortedArrays(new int[]{1,3}, new int[]{2});
        System.out.println(medianSortedArrays);

    }


    public double findMedianSortedArrays(int[] nums1,int[] nums2){

        if(nums1.length==0 && nums2.length==0){
            return 0;
        }
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length ; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int size = list.size();
        if (size % 2 == 0) {
            //偶数
            return (double) (list.get(size / 2-1) + list.get(size / 2))/2;
        } else {
            //奇数
            if (size > 1) {
                return list.get((1+size )/ 2 -1);
            } else {
                return list.get(0);
            }
        }

    }
}
