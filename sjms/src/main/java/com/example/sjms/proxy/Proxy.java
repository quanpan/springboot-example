package com.example.sjms.proxy;

public class Proxy implements Source {

    private Source source;

    public Proxy() {
        super();
        this.source = new SourceImpl();

    }

    public Proxy(Source source) {
        super();
        this.source = source;

    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void after() {
    }

    private void before() {
    }
}
