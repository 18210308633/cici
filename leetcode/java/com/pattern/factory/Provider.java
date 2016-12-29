package com.pattern.factory;

/**
 * Created by rensong.pu on 2016/12/28.
 */
public interface Provider {
    Calc getCalc(int[] num);
}
