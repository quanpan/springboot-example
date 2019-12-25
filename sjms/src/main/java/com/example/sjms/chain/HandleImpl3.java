package com.example.sjms.chain;

public class HandleImpl3 extends AbstractHandle implements Handle {

    @Override
    public void operator() {

        System.out.println("处理器3完成，传递");

        if (getHandle() != null) {
            getHandle().operator();
        }

    }
}
