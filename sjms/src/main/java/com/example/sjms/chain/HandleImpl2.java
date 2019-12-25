package com.example.sjms.chain;

public class HandleImpl2 extends AbstractHandle implements Handle {

    @Override
    public void operator() {

        System.out.println("处理器2完成，传递");

        if (getHandle() != null) {
            getHandle().operator();
        }
    }
}
