package com.test;

import java.math.BigInteger;

/**
 * Created by rensong.pu on 2016/12/28.
 */
public class TestBigINt {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger(String.valueOf(123123123));
        BigInteger bigInteger2 = new BigInteger(String.valueOf(123123123));
        System.out.println(bigInteger==bigInteger2);
        System.out.println(bigInteger.equals(bigInteger2));
        System.out.println(bigInteger.compareTo(bigInteger2));
    }
}
