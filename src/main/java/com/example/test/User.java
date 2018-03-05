package com.example.test;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 用户实体类  * @author chenqunaho  * create date：2010-11-2 下午11:02:47
 */
public class User {

    private int id;  //用户id
    private int age; //用户年龄
    private String name; //用户名

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "ID：" + id + "，年龄：" + age + "，名字：" + name;
    }


}

class UserComparator implements Comparator<User> {
    /**
     * 比较器方法   * 先按年龄排序从小到大，如果年龄一样的话按id排序
     */
    @Override
    public int compare(User o1, User o2) {

        if (o1.getAge() > o2.getAge()) return 1;
        else if (o1.getAge() == o2.getAge()) {
           /* if (o1.getId() > o2.getId()) return 1;
            else if (o1.getId() == o2.getAge()) return 0;
            else return -1;*/
            CollationKey collationKey = Collator.getInstance().getCollationKey(o1.getName());
            CollationKey collationKeyT = Collator.getInstance().getCollationKey(o2.getName());
            return collationKey.compareTo(collationKeyT);
        } else return -1;
    }

    /**
     * 用户实体类排序的测试类  * @author chenqunaho  * create date：2010-11-2 下午11:14:11
     */


    public static void main(String[] args) {
        //创建测试数据
        List<User> users = new ArrayList<User>();
        User u1 = new User(1000, 20, "张三");
        User u2 = new User(1001, 18, "lisi");
        User u3 = new User(1002, 20, "wangwu");
        User u4 = new User(1003, 23, "赵六");
        User u5 = new User(999, 20, "mouqi");
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
        //创建比较器对象
        UserComparator comp = new UserComparator();
        //调用排序方法
        Collections.sort(users, comp);
        //遍历集合打印测试数据
        for (User user : users) {
            System.out.println(user);
        }
    }

}
