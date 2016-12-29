package com.pattern.factory;

/**
 * 抽象类，计算
 * Created by rensong.pu on 2016/12/28.
 */
public abstract class Calc {
    protected int[] num;

    public Calc(int[] num) {
        this.num = num;
    }

    public abstract double calc();
}
