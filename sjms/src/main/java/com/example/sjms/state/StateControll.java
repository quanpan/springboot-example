package com.example.sjms.state;

public class StateControll {

    private State state;

    public StateControll(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void press() {

        state.press();
    }
}
