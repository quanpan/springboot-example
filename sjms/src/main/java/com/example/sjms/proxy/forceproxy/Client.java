package com.example.sjms.proxy.forceproxy;

public class Client {

    public static void main(String[] args) {

        GamePlayer gamePlayer = new GamePlayerImpl();

        GamePlayer proxy = new GamePlayerProxy(gamePlayer);

        gamePlayer.login("root", "123456");
    }
}
