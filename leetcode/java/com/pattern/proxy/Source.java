package com.pattern.proxy;

/**
 * Created by rensong.pu on 2016/12/29.
 */
public class Source implements SourceI{
    @Override
    public void method() {
        System.out.println("this is orignal method!");
    }
}
