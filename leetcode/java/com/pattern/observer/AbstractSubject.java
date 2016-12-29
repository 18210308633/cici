package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rensong.pu on 2016/12/29.
 */
public abstract class AbstractSubject implements Subject{

    List<Observer> obs = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        obs.add(observer);
    }

    @Override
    public void del(Observer observer) {
        obs.remove(observer);
    }

    @Override
    public void notifyObs() {
        obs.forEach(observer -> observer.update());
    }

    public abstract void operation();

}
