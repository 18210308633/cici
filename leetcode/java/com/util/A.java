package com.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rensong.pu on 2016/10/9.
 */
public class A {
    public static void main(String[] args) {
        String sql = "select * from %s";
        String table = "jiling";
        System.out.println(String.format(sql,table));

    }
}
