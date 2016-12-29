package com.pattern.Singleton;

/**
 * 单例模式
 * Created by rensong.pu on 2016/12/28.
 */
public class SingleMain {

    //持有私有静态实例，防止被引用，此处赋值null，实现延迟加载
    private static SingleMain singleMainInstance = null;

    //构造方法私有
    private SingleMain() {}

    //工厂静态方法获取单例实例
    public static SingleMain getInstance() {
        if (singleMainInstance == null) {
            synchronized (singleMainInstance) {
                if (singleMainInstance == null) {
                    singleMainInstance = new SingleMain();
                }
            }
        }
        return singleMainInstance;
    }
}
