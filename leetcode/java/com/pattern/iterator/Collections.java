package com.pattern.iterator;

/**
 * Created by thinkpad on 2016/12/30.
 */
public interface Collections {
    IteratorI iterator();
    Object get(int index);
    int length();
    void put(Object o);
}
