package com.example.sjms.factory;

public class testfactory {

    public static void main(String[] args) {

        SendFactory factory = new SendFactory();
        Sender sender = factory.produceSms();
        sender.send();
    }

}
