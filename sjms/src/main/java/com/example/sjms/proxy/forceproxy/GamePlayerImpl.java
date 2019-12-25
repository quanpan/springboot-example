package com.example.sjms.proxy.forceproxy;

public class GamePlayerImpl implements GamePlayer {

    private GamePlayer proxy = null;

    @Override
    public void login(String user, String pass) {
        if (this.proxy == null) {
            System.out.println("必须通过代理商登陆！");
        } else {
            System.out.println("登录名为" + user + "的用户" + pass + "登录成功！");
        }
    }

    @Override
    public void play() {

    }

    @Override
    public GamePlayer isProxy() {
        if (this.proxy == null) {
            this.proxy = new GamePlayerProxy(this);
        }
        return this.proxy;
    }
}
