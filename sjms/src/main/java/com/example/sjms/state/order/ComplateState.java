package com.example.sjms.state.order;

public class ComplateState extends OrderState {

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

        System.out.println("已确认");
    }

    @Override
    public void cancel(Context context) {

        System.out.println("订单取消");

        context.setOrderState(new CancelState());

        context.cancel();
    }

    @Override
    public void complate(Context context) {

        System.out.println("过仓完毕，代发货");
    }
}
