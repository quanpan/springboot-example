package com.example.sjms.state;

public class StateTest {

    public static void main(String[] args) {

        StateControll controll = new StateControll(new NullState());

        controll.press();
    }
}
