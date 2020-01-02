package com.example.sjms.memento.trans;

import java.util.ArrayList;
import java.util.List;

public class TransitionMemento {

    private Integer logNum;

    private List<Integer> data = new ArrayList<>();

    public TransitionMemento(Integer logNum, List<Integer> data) {
        this.logNum = logNum;
        this.data = data;
    }

    public Integer getLogNum() {
        return logNum;
    }

    public void setLogNum(Integer logNum) {
        this.logNum = logNum;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }
}
