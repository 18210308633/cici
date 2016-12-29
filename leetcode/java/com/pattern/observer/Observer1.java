package com.pattern.observer;

/**
 * Created by rensong.pu on 2016/12/29.
 */
public class Observer1 implements Observer{
    @Override
    public void update() {
        System.out.println("observer1 is notified!");
    }
}
