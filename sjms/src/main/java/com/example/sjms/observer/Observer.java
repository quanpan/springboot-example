package com.example.sjms.observer;

public interface Observer {

    <E> void update(E e);
}
