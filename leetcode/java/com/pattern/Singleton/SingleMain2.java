package com.pattern.Singleton;

/**
 * 完美的单例模式，避免了多进程并发时实例初始化为空的问题
 * Created by rensong.pu on 2016/12/28.
 */
public class SingleMain2 {
    //私有化构造器
    private  SingleMain2(){}

    //持有一个静态工厂类
    public static class SingleMainFactory{
        private static SingleMain2 singleMain2Instance = new SingleMain2();
    }

    //单例获取，因为类加载之间线程互斥
    public SingleMain2 getInstance(){
        return SingleMainFactory.singleMain2Instance;
    }

    //对象用于序列化，可以保证序列化前后一致
    public Object readReSolve(){
        return getInstance();
    }
}
