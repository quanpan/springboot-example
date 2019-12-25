package com.example.sjms.observer;

import com.alibaba.fastjson.JSON;

public class Observer2Impl implements Observer {

    @Override
    public <E> void update(E e) {

//        Subject1Impl subject1 = new Subject1Impl();


        System.out.println("observer2 被通知更新 node:" + JSON.toJSONString(e));
    }
}
