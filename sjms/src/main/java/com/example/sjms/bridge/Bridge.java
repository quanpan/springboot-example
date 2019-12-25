package com.example.sjms.bridge;

public abstract class Bridge {

    private Source source;

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }


    public void bridgeMethod() {

        source.method();
    }
}
