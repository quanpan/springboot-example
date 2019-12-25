package com.example.sjms.state.order;

public class CreateOrderState extends OrderState {

    @Override
    public void crete(Context context) {

        System.out.println("创建订单完成，等待支付");

        context.setOrderState(new PayState());

        context.pay();
    }

    @Override
    public void pay(Context context) {

        System.out.println("没有该订单");
    }

    @Override
    public void confirem(Context context) {

        System.out.println("没有该订单");
    }

    @Override
    public void cancel(Context context) {

        System.out.println("没有该订单");
    }

    @Override
    public void complate(Context context) {

        System.out.println("没有该订单");
    }
}
