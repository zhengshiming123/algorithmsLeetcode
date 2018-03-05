package com.example.algorithms;

/**
 * Created by h on 2018/2/28.
 * 大多数水的容器
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = new int[]{1,2,3,4,5};

        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int i = containerWithMostWater.maxArea(height);
        System.out.println(i);

    }

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }
        return maxArea;
    }


}
