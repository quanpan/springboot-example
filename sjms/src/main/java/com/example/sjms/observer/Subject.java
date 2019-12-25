package com.example.sjms.observer;

public interface Subject {

    void add(Observer observer);

    void del(Observer observer);

    <E> void notifyObserver(E e);

    <E> void operation(E e);

    <E> void makeChange(E e);
}
