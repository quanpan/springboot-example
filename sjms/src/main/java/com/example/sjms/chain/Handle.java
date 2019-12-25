package com.example.sjms.chain;

public interface Handle {

    Handle next(Handle handle);

    void operator();

}
