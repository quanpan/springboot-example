package com.example.sjms.state.dtexample;


public class StopState extends AbstactStateOperate {

    /**
     * 更新状态
     * 操作
     */
    @Override
    public void open(ClientImpl client) {

        System.out.println("stop ==> open开门");

        client.setOperate(new OpenState());

        client.open();

    }

    @Override
    public void colse(ClientImpl client) {

        client.setOperate(new CloseState());

        client.colse();

        System.out.println("stop ==> close关门");
    }

    @Override
    public void run(ClientImpl client) {

        client.setOperate(new RunState());

        client.run();

        System.out.println("stop ==> run");
    }

    @Override
    public void stop(ClientImpl client) {

        System.out.println("停下");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        client.setOperate(new OpenState());

        client.open();

    }
}
