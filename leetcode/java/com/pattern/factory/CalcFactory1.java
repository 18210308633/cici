package com.pattern.factory;


/**
 *
 * 传递参数的方式建造普通工厂类
 * Created by rensong.pu on 2016/12/28.
 */
public class CalcFactory1 {
    public static Calc getCalc(OPT type,int[] num){
        switch (type){
            case MUTIPLE:return new MultiCalc(num);
            default:return new AddCalc(num);
        }
    }

}
