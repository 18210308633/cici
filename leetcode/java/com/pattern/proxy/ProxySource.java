package com.pattern.proxy;

/**
 * 代理模式的应用场景：
 * 如果已有的方法在使用的时候需要对原方法进行改进：
 * 1、修改原有方法来适应
 * 2、采用一个代理类调用原方法、且对产生的结果进行控制
 * Created by rensong.pu on 2016/12/29.
 */
public class ProxySource implements SourceI{

    private Source source;

    public ProxySource() {
        this.source = new Source();
    }

    @Override
    public void method() {
        System.out.println("before method");
        source.method();
        System.out.println("after method");
    }
}
