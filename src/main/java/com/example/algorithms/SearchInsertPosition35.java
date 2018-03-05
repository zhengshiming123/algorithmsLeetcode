package com.example.algorithms;

/**
 * Created by h on 2018/3/1.
 */
public class SearchInsertPosition35 {


    public static void main(String[] args) {
        SearchInsertPosition35 serach = new SearchInsertPosition35();
        serach.searchInsert(new int[]{1, 3, 5, 6}, 6);
    }
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int height = nums.length-1;

        while(low<=height){

            int mid = (low+height)/2;
            if(nums[mid] ==target){
                return mid;
            }else if( nums[mid]<target){
                low=mid+1;
            }else{
                height = mid-1;
            }

        }
        return low;

    }
}
