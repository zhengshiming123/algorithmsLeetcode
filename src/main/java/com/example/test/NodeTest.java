package com.example.test;

/**
 * Created by h on 2018/2/28.
 */
public class NodeTest {

    public static void main(String[] args) {
        NodeTest nodeTest = new NodeTest();
        long ff = nodeTest.ff(3);
        System.out.println(ff);

    }

    public long ff ( int n){
        long f = 0;
        if (n < 0)
            System.out.println("n<0,input error");
        else if (n == 0 || n == 1)
            f = 1; //为什么f=1,就不再继续递归调用？
        else
            f = ff(n - 1) * n;//这一步到底是怎么工作的？
        return f;
    }
}
