package com.example.sjms.strategy.enumstrategy;

public enum MethodEnum {


    PLATFORM_ORDER_NOTIFY("platform_order_notify") {
        @Override
        public String excute(String str1, String str2) {

            return null;
        }
    };

    private String menthod;

    MethodEnum(String methodName) {
        this.menthod = methodName;
    }

    public abstract String excute(String str1, String str2);
}
