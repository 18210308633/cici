package com.pattern.Adapter;

/**
 * 类的适配器
 * Created by rensong.pu on 2016/12/28.
 */
public class Adapter extends Source implements TargetI{

    @Override
    public void method2() {
        System.out.println("this is method2!");
    }
}
