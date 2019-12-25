package com.example.sjms.state;

public class NullState implements State {

    @Override
    public void press() {

        System.out.println("nullstate");

    }
}
