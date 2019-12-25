package com.example.sjms.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {

    public static <T> T newInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler invocationHandler) {

        Advice beforeAdvice = new BeforeAdvice();
        beforeAdvice.excute();

        return (T) Proxy.newProxyInstance(loader, interfaces, invocationHandler);
    }
}
