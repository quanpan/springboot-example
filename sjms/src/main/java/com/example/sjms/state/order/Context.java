package com.example.sjms.state.order;

public class Context {

    private OrderState orderState;

    public Context(OrderState orderState) {
        if (orderState == null) {
            orderState = new CreateOrderState();
        }
        this.orderState = orderState;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void create() {
        orderState.crete(this);
    }

    public void pay() {
        orderState.pay(this);
    }

    public void confirem() {
        orderState.confirem(this);
    }

    public void cancel() {
        orderState.cancel(this);
    }

    public void complate() {
        orderState.complate(this);
    }
}
