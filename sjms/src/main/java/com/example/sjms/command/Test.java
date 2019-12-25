package com.example.sjms.command;

public class Test {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        new Invoker(command).action();
    }
}
