package com.pattern.Adapter;

/**
 * 对象的适配器
 * 不直接继承source类，而是持有source类的实例，解决兼容性问题
 * Created by rensong.pu on 2016/12/28.
 */
public class Adapter2 implements TargetI{
    private Source source;

    public Adapter2(Source source) {
        this.source = source;
    }

    @Override
    public void method2() {
        System.out.println("this is method2!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}
