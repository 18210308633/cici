package com.pattern.responsityChain;

/**
 * Created by thinkpad on 2016/12/30.
 */
public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(name + "is in operation");

        if (getHander() != null) {
            getHander().operation();
        }
    }
}
