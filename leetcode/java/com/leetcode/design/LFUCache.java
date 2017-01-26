package com.leetcode.design;

import java.util.HashMap;

/**
 * Created by thinkpad on 2016/12/11.
 */
public class LFUCache {
    private HashMap<Integer,Integer> cache = new HashMap();
    private int capacity;
    public LFUCache(int capacity){
        this.capacity = capacity;
    }
    public int get(int key){
        return  cache.get(key);
    }
    public void set(int key,int val){
        cache.put(key,val);
    }
}
