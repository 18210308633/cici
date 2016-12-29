package com.pattern.factory;

/**
 * Created by rensong.pu on 2016/12/28.
 */
public class MinusFactory implements Provider{
    @Override
    public Calc getCalc(int[] num) {
        return new MinusCalc(num);
    }
}
