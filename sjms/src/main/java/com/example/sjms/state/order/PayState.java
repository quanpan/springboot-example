package com.example.sjms.state.order;

public class PayState extends OrderState {

    @Override
    public void crete(Context context) {

        System.out.println("订单重复创建，已存在");
    }

    @Override
    public void pay(Context context) {

        System.out.println("支付订单完成，等待确认");

        context.setOrderState(new ConfirmState());

        context.confirem();
    }

    @Override
    public void confirem(Context context) {

        System.out.println("未支付");
    }

    @Override
    public void cancel(Context context) {

        System.out.println("订单取消");

        context.setOrderState(new CancelState());
    }

    @Override
    public void complate(Context context) {

        System.out.println("未支付");
    }
}
