package com.example.sjms.decorator;

public class Test {

    public static void main(String[] args) {

        Source source = new SourceImpl();

        Source source1 = new Decorator(source);


//        source.method();
        source1.method();
    }
}
