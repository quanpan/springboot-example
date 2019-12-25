package com.example.sjms.state.dtexample;

public class RunState extends AbstactStateOperate {

    @Override
    public void open(ClientImpl client) {

        System.out.println("电梯运行中不能开门");
    }

    @Override
    public void colse(ClientImpl client) {

        System.out.println("电梯运行中已经关门");
    }

    @Override
    public void run(ClientImpl client) {

        int next = calFloor(client.getDianTi());

        if (next == client.getDianTi().getNowFloor()) {

            System.out.println("已经在" + next + "楼");

        } else {

            System.out.println("起飞去" + next + "楼");

            client.getDianTi().setNowFloor(next);

            client.getDianTi().setWait(remove(client.getDianTi().getWait(), next));

            client.setOperate(new StopState());

            client.stop();
        }
    }

    @Override
    public void stop(ClientImpl client) {

        System.out.println("到了");

        client.setOperate(new StopState());

        client.stop();

    }
}
