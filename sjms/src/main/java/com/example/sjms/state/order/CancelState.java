package com.example.sjms.state.order;

public class CancelState extends OrderState {

    @Override
    public void crete(Context context) {

        System.out.println("订单重建");

        context.setOrderState(new CreateOrderState());

        context.create();
    }

    @Override
    public void pay(Context context) {

        System.out.println("订单已取消");
    }

    @Override
    public void confirem(Context context) {

        System.out.println("订单已取消");
    }

    @Override
    public void cancel(Context context) {

        System.out.println("订单已取消");
    }

    @Override
    public void complate(Context context) {

        System.out.println("订单已取消");
    }
}
