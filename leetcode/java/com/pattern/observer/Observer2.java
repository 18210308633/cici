package com.pattern.observer;

/**
 * Created by rensong.pu on 2016/12/29.
 */
public class Observer2 implements Observer{
    @Override
    public void update() {
        System.out.println("observer2 is notified!");
    }
}
