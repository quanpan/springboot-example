package com.example.sjms.observer;

import com.alibaba.fastjson.JSON;
import com.example.sjms.zuhe.Node;

public class Test {

    public static void main(String[] args) {

        Subject subject1 = new Subject1Impl();
        subject1.add(new Observer1Impl());
        subject1.add(new Observer2Impl());

        Node node = new Node("parent");

        System.out.println("1" + JSON.toJSON(node));

        subject1.operation(node);

//        System.out.println("2" + JSON.toJSON(node));


//        Tree tree = new Tree("parentNode");
//
//        Node node1 = new Node("parentNode_1");
//        Node node2 = new Node("parentNode_2");
//
//        node1.addNode(node2);
//        node1.addNode(node2);
////       node2.addNode(node1);
//        tree.node.addNode(node1);
////       tree.node.addNode(node2);
//
//        Subject1Impl subject1 = new Subject1Impl();
//
//        subject1.setNode(tree.node);
//
//        System.out.println(JSON.toJSONString(tree.node));
//
//        Subject subject1 = new Subject1Impl();
//        subject1.add(new Observer1Impl());
//        subject1.add(new Observer2Impl());
//
//        subject1.operation();
    }
}
