package com.example.sjms.memento.trans;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        OrgData orgData = new OrgData(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));

        TransitionMemento memento = orgData.createMement();

        System.out.println();

        orgData.restore(memento);
    }
}
