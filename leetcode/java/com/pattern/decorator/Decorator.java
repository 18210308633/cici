package com.pattern.decorator;

/**
 * 当我们需要扩展一个类的功能时，可以写一个Decorator类，将类传到Decorator的构造方法中
 * 在装饰器类里持有该类的实例，调用该类的方法，前后可以加一些Decorator类的处理
 * 场景有new InputStream(new FileInputStream())
 * Created by rensong.pu on 2016/12/28.
 */
public class Decorator {
    private Base base;

    public Decorator(Base base) {
        this.base = base;
    }

    public void work(){
        System.out.println("before work");
        base.work();
        System.out.println("after work");
    }
}
