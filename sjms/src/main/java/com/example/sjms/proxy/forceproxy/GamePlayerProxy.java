package com.example.sjms.proxy.forceproxy;

public class GamePlayerProxy implements GamePlayer {

    private GamePlayer gamePlayer;

    public GamePlayerProxy(GamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String pass) {
        this.gamePlayer.login(user, pass);
    }

    @Override
    public void play() {

    }

    @Override
    public GamePlayer isProxy() {
        return null;
    }
}
