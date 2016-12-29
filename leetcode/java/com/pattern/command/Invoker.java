package com.pattern.command;

/**
 * 司令
 * Created by thinkpad on 2016/12/30.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
