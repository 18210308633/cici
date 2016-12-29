package com.pattern.command;

/**
 * Created by thinkpad on 2016/12/30.
 */
public class MyCommand  implements Command{

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
