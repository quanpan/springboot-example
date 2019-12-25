package com.example.sjms.chain;

public class HandleImpl1 extends AbstractHandle implements Handle {

    @Override
    public void operator() {

        System.out.println("处理器1完成，传递");

        if (getHandle() != null) {
            getHandle().operator();
        }
    }
}
