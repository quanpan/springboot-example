package com.example.sjms.decorator;

public class Decorator implements Source {

    private Source source;

    public Decorator(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        before();
        source.method();
        extension();
        after();
    }

    private void after() {
        System.out.println("源方法1实现后置");
    }

    private void before() {
        System.out.println("源方法1实现前置");
    }

    private void extension() {

        System.out.println("源方法1实现扩展");
    }
}
