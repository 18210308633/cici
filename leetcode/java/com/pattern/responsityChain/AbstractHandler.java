package com.pattern.responsityChain;

/**
 * Created by thinkpad on 2016/12/30.
 */
public abstract class AbstractHandler {
    private Handler handler;
    public Handler getHander(){
        return handler;
    }
    public void setHandler(Handler handler){
        this.handler = handler;
    }
}
