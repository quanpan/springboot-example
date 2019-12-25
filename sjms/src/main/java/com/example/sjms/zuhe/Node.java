package com.example.sjms.zuhe;

import lombok.Data;

import java.util.Enumeration;
import java.util.Vector;

@Data
public class Node {

    private String name;
    private Node node;
    private Vector<Node> nodes = new Vector<Node>();

    public Node(String name) {
        this.name = name;
    }

    public void addNode(Node node) {

        nodes.add(node);
    }

    public void removeSheet(Node node) {

        nodes.remove(node);
    }

    public Enumeration<Node> getNode() {

        return nodes.elements();
    }


}
