package com.example.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by h on 2018/1/31.
 */
public class UserTest {

    @Test
    public void test01() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, 12, "a1"));
        list.add(new User(2, 23, "a2"));
        list.add(new User(3, 9, "a3"));

        Collections.sort(list);
        for (User user : list) {
            System.out.println(user);
        }
    }

}
