package com.example.sjms.proxy;

public class SourceImpl implements Source {

    @Override
    public void method() {

        System.out.println("a、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。\n" +
                "b、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。\n" +
                "使用代理模式，可以将功能划分的更加清晰，有助于后期维护！");
    }
}
