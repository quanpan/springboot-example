package com.example.sjms.state.dtexample;

public class OpenState extends AbstactStateOperate {

    @Override
    public void open(ClientImpl client) {

        System.out.println("电梯已经开门");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        client.setOperate(new CloseState());

        client.colse();

    }

    @Override
    public void colse(ClientImpl client) {

        client.setOperate(new CloseState());

        client.colse();

        System.out.println("open ==> close关门");
    }

    @Override
    public void run(ClientImpl client) {

        System.out.println("门开着走不了");
    }

    @Override
    public void stop(ClientImpl client) {

        System.out.println("开着电梯门停下");

        client.setOperate(new StopState());

        client.stop();

    }
}
