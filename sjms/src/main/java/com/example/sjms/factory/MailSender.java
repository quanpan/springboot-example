package com.example.sjms.factory;

public class MailSender implements Sender {

    @Override
    public void send() {

        System.out.println("this is mailsender!");
    }
}
