package com.example.sjms.proxy.forceproxy;

public interface GamePlayer {

    void login(String user, String pass);

    void play();

    GamePlayer isProxy();
}
