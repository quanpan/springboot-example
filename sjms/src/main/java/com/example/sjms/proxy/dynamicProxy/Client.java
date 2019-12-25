package com.example.sjms.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;

public class Client {

    public static void main(String[] args) {

        Subject subject = new SubjectImpl();
        InvocationHandler invocationHandler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), invocationHandler);

        proxy.doSameThing("123");
    }
}
