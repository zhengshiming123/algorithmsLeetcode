package com.example.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by h on 2018/3/7.
 */
public class Array118 {

    public static void main(String[] args) {
        Array118 array118 = new Array118();
        List<List<Integer>> generate = array118.generate1(5);
        System.out.println(generate);

    }
    public List<List<Integer>> generate1(int numRows) {

        List<List<Integer>> wrapList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i=0 ; i<numRows ; i++) {
            list.add(0, 1);
            for (int j =1 ; j<list.size()-1;j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
            wrapList.add(new ArrayList<Integer>(list));
        }
        return wrapList;
    }




    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++)
        {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++)
                row.set(j, row.get(j)+row.get(j+1));
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
    }
}
