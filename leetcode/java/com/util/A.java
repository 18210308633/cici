package com.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rensong.pu on 2016/10/9.
 */
public class A {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        List list2 = new ArrayList<>();
        list2.add("3");
        list.removeAll(list2);

    }
}
