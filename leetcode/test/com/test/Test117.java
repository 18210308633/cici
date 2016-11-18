package com.test;

/**
 * Created by rensong.pu on 2016/11/7.
 */
public class Test117 {
    int a = 1;

    {
        a = 2;
    }

    public static void main(String[] args) {
        Test117 test117 = new Test117();
        System.out.println(test117.a);
    }
}
