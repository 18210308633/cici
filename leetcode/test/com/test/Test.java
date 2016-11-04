package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by thinkpad on 2016/10/24.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));

        List<String> list1 = Arrays.asList("3","2","4");
        List<String> list2 = Arrays.asList("3","2","5");
        CopyOnWriteArrayList list11 = new CopyOnWriteArrayList(list1);
        CopyOnWriteArrayList list22 = new CopyOnWriteArrayList(list2);

//        list11.retainAll(list22);
        list11.forEach(e->{
                             System.out.print(e + " ");
                         });

            System.out.println();

        list22.forEach(e->{
                              System.out.print(e + " ");
                          });


    }
}
