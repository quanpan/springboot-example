package com.example.sjms.visitor.node;

public class NodeIsField implements Node {

    @Override
    public void accept(Visitor visitor) {

        visitor.visit(this);

    }

    @Override
    public void exce() {

    }
}
