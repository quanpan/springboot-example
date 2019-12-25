package com.example.sjms.proxy.dynamicProxy;

public class BeforeAdvice implements Advice {

    @Override
    public void excute() {
        System.out.println("前置通知");
    }
}
