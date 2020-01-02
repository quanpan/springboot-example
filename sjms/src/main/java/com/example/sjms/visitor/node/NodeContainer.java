package com.example.sjms.visitor.node;

import java.util.ArrayList;
import java.util.List;

public class NodeContainer {

    List<Node> nodes;

    public NodeContainer() {
        this.nodes = new ArrayList<>();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void removeNode(Node node) {

        nodes.remove(node);
    }

    public void excute(Visitor visitor) {
        for (Node node : nodes) {
            node.accept(visitor);
        }
    }
}
