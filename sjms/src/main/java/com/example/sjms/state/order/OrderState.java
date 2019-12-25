package com.example.sjms.state.order;

abstract class OrderState {

    abstract public void crete(Context context);

    abstract public void pay(Context context);

    abstract public void confirem(Context context);

    abstract public void cancel(Context context);

    abstract public void complate(Context context);

}
