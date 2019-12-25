package com.example.sjms.state.order;

public class Test {

    public static void main(String[] args) {

//        OrderState orderState = new CreateOrderState();
//        OrderState orderState = new PayState();
//        OrderState orderState = new ConfirmState();
        OrderState orderState = new CancelState();
//        OrderState orderState = new CreateOrderState();

        Context context = new Context(orderState);

        context.create();
//        context.pay();
//        context.confirem();
//        context.cancel();
//        context.complate();

    }
}
