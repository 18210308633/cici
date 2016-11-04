package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by rensong.pu on 2016/11/4.
 */
public class Merge {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("1");
        list2.add("2");
        list1.add("3");
        list1.add("4");
        list2.add("4");
        list1.add("5");
        list2.add("6");
//        list2.add("8");
        list1.add("8");
        List<String> common = new ArrayList<>(Arrays.asList(new String[list1.size()]));
        mergeList(list1,list2,common);
        common.forEach(e->{
                           System.out.println(e);
                       });
    }
    public static void mergeList(List<String> acid,List<String> origin,List<String> common){
        Collections.copy(common, acid);
        common.retainAll(origin);
    }
}
