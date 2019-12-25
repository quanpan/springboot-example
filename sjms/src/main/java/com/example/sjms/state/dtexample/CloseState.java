package com.example.sjms.state.dtexample;

public class CloseState extends AbstactStateOperate {

    @Override
    public void open(ClientImpl client) {

        client.setOperate(new OpenState());

        client.open();

        System.out.println("开门");
    }

    @Override
    public void colse(ClientImpl client) {

        System.out.println("已关闭");

        client.setOperate(new RunState());

        client.run();

    }

    @Override
    public void run(ClientImpl client) {

        client.setOperate(new RunState());

        client.run();

        System.out.println("close ==> run");
    }

    @Override
    public void stop(ClientImpl client) {

        System.out.println("close ==> stop 休眠");

    }
}
