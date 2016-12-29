package com.pattern.iterator;

/**
 * Created by thinkpad on 2016/12/30.
 */
public interface IteratorI {
    Object next();
    Object previous();
    boolean hasNext();
    Object first();
}
