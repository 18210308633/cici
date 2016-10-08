package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 对比线程安全的List->CopyOnWriteArrayList
 * Created by rensong.pu on 2016/9/23.
 */
public class CopyOnWriteArrayListTest {

    /**
     * 以前就遇到处理List中元素删除的情况，直接删除会报错(ConcurrentModificationException)，采取的是iterator间接删除
     * 原因剖析：
     * 在ArrayList中有一变量(_modCount) 记录的当前这个ArrayList被modify的次数，
     * 每当调用add/remove方法就会把该参数的值加一，
     * 当生成Iterator对象时该对象会记录当前状态ArrayList的修改次数，
     * 然后在每次调用it.next()时就会判断当前ArrayList修改次数是否和它记录的相同，
     * 如果不同就抛出异常。例如上面等效后的代码，当执行 it = list.iterator() ;时
     * it对象记录在执行这句代码之前list对象的修改次数，当第一次执行it.next()语句时不会发生异常，
     * 因为这时list还没有被修改，但是当第二次执行it.next()时list已经通过list.remove(temp)代码修改了其内部的修改次数变量，
     * 所以导致it对象记录的修改次数和list的修改次数不同，所以就抛出了异常。
     * 只需记住的准则是： 使用Iterator遍历集合时是不能修改集合的。
     */
    public static void testDelArrayList() {
//        List<Object> list = new ArrayList<>();

        /**
         * 使用copyOnWriteArrayList的时候，他会将list复制一份对副本进行'写'操作，然后把以前的list引用重新指向副本，所以不会出现异常
         */
        List<Object> list = new CopyOnWriteArrayList<>();
        list.add("123");
        list.add("hello java");
        list.add("hello java2");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
//            if (iterator.next().toString().equals("123")) {
            Object o = iterator.next();
            System.out.println("it=>" + o.toString());//读操作
//            list.remove(o);//写操作
//            iterator.remove();//迭代器直接remove会抛出异常UnsupportedOperationException,这种情况需要探讨
//            }
        }


        list.forEach(e -> {
//                         list.remove("123");
                         System.out.println(e.toString());
                     }
                    );

        System.out.println("-========");


        Iterator iterator1 = list.iterator();

        while (iterator1.hasNext()) {
            Object orgin = iterator1.next();
            String str2 = orgin.toString() + "----";
            list.remove(orgin);
            list.add(str2);
        }

        list.forEach(e -> {
//                         list.remove("123");
                         System.out.println(e.toString());
                     }
                    );

    }

    public static void main(String[] args) {
        testDelArrayList();
    }
}
