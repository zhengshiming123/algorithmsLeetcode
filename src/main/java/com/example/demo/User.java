package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by h on 2018/1/31.
 */
public class User implements Comparable<User> {

    public User(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    private Integer id;

    private Integer age;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        if (o.age > this.age) {
            return 1;
        } else if (Objects.equals(o.age, this.age)) {
            return 0;
        } else {
            return -1;
        }
    }

}
