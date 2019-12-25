package com.example.sjms.chain;

public abstract class AbstractHandle implements Handle {

    private Handle handle;

    public Handle getHandle() {
        return handle;
    }

    public Handle next(Handle handle) {
        this.handle = handle;
        return this.handle;
    }

}
