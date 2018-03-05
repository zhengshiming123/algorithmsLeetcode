package com.example.algorithms;

/**
 * Created by h on 2018/3/2.
 */
public class MergeSortedArray88 {

    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        while (m > 0) {

            nums1[n + m - 1] = ((n == 0 || (nums1[m - 1] > nums2[n - 1])) ? nums1[--m] : nums2[--n]);
        }
        while (n > 0) nums1[m + n - 1] = (m == 0 || nums2[n - 1] > nums1[m - 1]) ? nums2[--n] : nums1[--m];
    }
}
