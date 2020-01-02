package com.example.sjms.visitor.node;

public class VisitorA implements Visitor {

    @Override
    public void visit(Node node) {
        node.exce();
    }
}
