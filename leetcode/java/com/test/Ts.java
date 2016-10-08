package com.test;

/**
 * Created by rensong.pu on 2016/9/23.
 */
public class Ts {
    public void run(Integer i) {
        i = new Integer(2);
    }

    public static void main(String[] args) {
        Integer hh = new Integer(3);
        Ts hehe = new Ts();
        hehe.run(hh);
        System.out.println(hh);
    }

}
