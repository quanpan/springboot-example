package com.example.sjms.observer;

import com.example.sjms.zuhe.Node;

public class Subject1Impl extends AbstractSubject {

    @Override
    public <E> void makeChange(E e) {

        Node node = (Node) e;

        Node node1 = new Node("parentNode_1");
        Node node2 = new Node("parentNode_2");

        node.addNode(node1);
        node.addNode(node2);
    }


    @Override
    public <E> void operation(E e) {

        makeChange(e);
        System.out.println("通知观察者更新。。。");
        notifyObserver(e);
    }
}
