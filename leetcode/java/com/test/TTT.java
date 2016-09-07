package com.test;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by rensong.pu on 2016/9/4.
 */
public class TTT {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        a.retainAll(b);
        System.out.println(a.size());

    }
}
