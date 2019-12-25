package com.example.sjms.factory;

public class SendSmslFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
