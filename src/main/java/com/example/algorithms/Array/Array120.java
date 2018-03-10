package com.example.algorithms.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by h on 2018/3/8.
 * 三角形最小路径和  利用DFS自下而上的
 */
public class Array120 {
    public static void main(String[] args) {
        Array120 array120 = new Array120();
        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(-10);
        triangle.add(0,list);
        //List<Integer> list2 = new ArrayList<>();
        //list2.add(2);
        //list2.add(3);
        //triangle.add(1,list2);
        //List<Integer> list3 = new ArrayList<>();
        //list3.add(5);
        //list3.add(4);
        //list3.add(7);
        //triangle.add(2,list3);

        int i = array120.minimumTotal2(triangle);
        System.out.println(i);
    }

    public int minimumTotal2(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);
            }
        }
        return A[0];
    }

    public int minimumTotal(List<List<Integer>> triangle) {

        List<List<Integer>> wrapList = new ArrayList<>();


        return total(triangle, 0);

    }

    public int total(List<List<Integer>> triangle, int count) {
        List<Integer> list = triangle.get(0);


        if (triangle.size() > 1) {
            List<Integer> list2 = triangle.get(1);
            int a = 0;
            triangle.remove(0);
            if (list2.get(count) > list2.get(count + 1)) {
                a = count + 1;
                return total(triangle, a) + list2.get(count + 1);
            } else {
                a = count;
                return total(triangle, a) + list2.get(count);
            }


        } else if (triangle.size() == 1) {
            triangle.remove(0);
            return list.get(0);
        } else
            return 0;
    }
}
