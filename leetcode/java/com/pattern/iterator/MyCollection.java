package com.pattern.iterator;

import java.util.Arrays;

/**
 * Created by thinkpad on 2016/12/30.
 */
public class MyCollection implements Collections {
    private static final int DEFAULT_CAPACITY = 3;//默认大小
    transient Object[] objs;

    private static final Object[] defaultObjs = {};

    private int size;

    public MyCollection() {
        this.objs = defaultObjs;
    }

    @Override
    public IteratorI iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int index) {
        return objs[index];
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public void put(Object o) {
        ensureCapacity(size + 1);
        objs[size++] = o;
    }

    private void ensureCapacity(int minCapacity) {
        if (objs == defaultObjs) {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }

        ensureExplicitCapacity(minCapacity);
    }

    private void ensureExplicitCapacity(int minCapacity) {
        if (minCapacity - objs.length > 0)
            grow(minCapacity);
    }

    private void grow(int minCapacity) {
        int oldCapacity = objs.length;
        int newCapacity = oldCapacity+(oldCapacity>>1);
        if(newCapacity-minCapacity<0){
            newCapacity = minCapacity;//不超过默认大小
        }
       if(newCapacity- Integer.MAX_VALUE>0){
           newCapacity = hugeCapacity(minCapacity);//超过最大的整形数
       }
        objs = Arrays.copyOf(objs,newCapacity);
    }

    private int hugeCapacity(int minCapacity) {
        if(minCapacity<0){
            throw new OutOfMemoryError();
        }
        return minCapacity>Integer.MAX_VALUE?Integer.MAX_VALUE:minCapacity;
    }


}
