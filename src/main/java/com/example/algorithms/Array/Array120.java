package com.example.algorithms.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by h on 2018/3/8.
 */
public class Array120 {
    public static void main(String[] args) {
        Array120 array120 = new Array120();
        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        triangle.add(0,list);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        triangle.add(1,list2);

        int i = array120.minimumTotal(triangle);
        System.out.println(i);
    }

    public int minimumTotal(List<List<Integer>> triangle) {

        List<List<Integer>> wrapList = new ArrayList<>();


        return total(triangle, 0);

    }

    public int total(List<List<Integer>> triangle, int count) {
        List<Integer> list = triangle.get(0);
        List<Integer> list2 = triangle.get(1);

        if (triangle.size() > 1) {
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
