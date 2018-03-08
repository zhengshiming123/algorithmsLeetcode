package com.example.algorithms.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by h on 2018/3/7.
 */
public class Array119 {
    public static void main(String[] args) {
        Array119 array119 = new Array119();
        List<Integer> row = array119.getRow(3);
        System.out.println(row);

    }

    public List<Integer> getRow(int rowIndex) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {

            list.add(0, 1);
            for (int j = 1; j < list.size() - 1; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
        }
        return list;

    }
}
