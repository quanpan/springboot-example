package com.example.sjms.state.order;

public class ConfirmState extends OrderState {

    @Override
    public void crete(Context context) {

        System.out.println("订单重复创建，已存在");
    }

    @Override
    public void pay(Context context) {

        System.out.println("已支付");
    }

    @Override
    public void confirem(Context context) {

        System.out.println("确认支付，等待过仓");

        context.setOrderState(new ComplateState());

        context.complate();
    }

    @Override
    public void cancel(Context context) {

        System.out.println("用户取消订单");

        context.setOrderState(new CancelState());

        context.cancel();
    }

    @Override
    public void complate(Context context) {

        System.out.println("过仓未完成");

    }
}
