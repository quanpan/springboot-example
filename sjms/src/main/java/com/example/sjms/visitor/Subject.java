package com.example.sjms.visitor;

public interface Subject {

    void accept(Visitor visitor);

    String getSubject();
}
