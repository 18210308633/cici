package com.pattern.factory;

/**
 * 多个工厂方法模式
 * 同时可以将方法设置成静态获取
 * Created by rensong.pu on 2016/12/28.
 */
public class CalcFactory2 {
    public static AddCalc getAddCalc(int[] num){
        return new AddCalc(num);
    }
}
