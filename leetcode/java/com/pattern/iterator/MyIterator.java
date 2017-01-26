package com.pattern.iterator;

/**
 * Created by thinkpad on 2016/12/30.
 */
public class MyIterator  implements IteratorI{
    private Collections collections;

    private int pos = -1;

    public MyIterator(Collections collections) {
        this.collections = collections;
    }

    @Override
    public Object next() {
        if(pos<collections.length()-1){
            pos++;
        }
        return collections.get(pos);
    }

    @Override
    public Object previous() {
        if(pos>0){
            pos--;
        }
        return collections.get(pos);
    }

    @Override
    public boolean hasNext() {
        if(pos<collections.length()-1){
            return true;
        }
        return false;
    }

    @Override
    public Object first() {
        pos = 0;
        return collections.get(pos);
    }
}
