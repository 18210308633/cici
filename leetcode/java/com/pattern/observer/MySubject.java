package com.pattern.observer;

/**
 * Created by rensong.pu on 2016/12/29.
 */
public class MySubject extends AbstractSubject{
    @Override
    public void operation() {
        System.out.println("operation process");
        notifyObs();
    }
}
