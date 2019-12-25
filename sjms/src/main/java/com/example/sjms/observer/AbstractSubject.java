package com.example.sjms.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

    private Vector<Observer> observers = new Vector<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void del(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public <E> void notifyObserver(E e) {
        Enumeration<Observer> enumeration = observers.elements();

        while (enumeration.hasMoreElements()) {
            enumeration.nextElement().update(e);
        }
    }

}
