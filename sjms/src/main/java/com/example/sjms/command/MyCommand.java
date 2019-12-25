package com.example.sjms.command;

public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excete() {
        receiver.action();
    }
}
