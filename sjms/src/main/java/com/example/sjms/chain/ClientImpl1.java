package com.example.sjms.chain;

public class ClientImpl1 implements Client {

    @Override
    public void excute() {

        Handle handle1 = new HandleImpl1();
        Handle handle2 = new HandleImpl2();
        Handle handle3 = new HandleImpl3();

        handle1.next(handle2).next(handle3);

        handle1.operator();
    }
}
