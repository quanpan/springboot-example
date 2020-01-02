package com.example.sjms.memento.trans;

import java.util.List;

public class OrgData {

    private static int num = 0;

    private List<Integer> data;

    public OrgData(List<Integer> data) {
        this.data = data;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    public TransitionMemento createMement() {
        // 记录当前事物id和数据,暂存在TransitionMemento记录类当中
        return new TransitionMemento(num, data);

    }

    public void restore(TransitionMemento transitionMemento) {
        // 恢复数据
        num = transitionMemento.getLogNum();
        data = transitionMemento.getData();
    }
}
