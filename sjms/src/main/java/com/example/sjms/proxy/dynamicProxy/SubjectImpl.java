package com.example.sjms.proxy.dynamicProxy;

public class SubjectImpl implements Subject {

    @Override
    public void doSameThing(String str) {
        System.out.println("some" + str);
    }
}
