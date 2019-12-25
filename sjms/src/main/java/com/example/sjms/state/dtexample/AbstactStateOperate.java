package com.example.sjms.state.dtexample;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class AbstactStateOperate {

    abstract public void open(ClientImpl client);

    abstract public void colse(ClientImpl client);

    abstract public void run(ClientImpl client);

    abstract public void stop(ClientImpl client);

    public Integer[] remove(Integer[] wait, int nowFloor) {

        List<Integer> newList = new ArrayList<>();

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(wait));

        if (wait != null) {

            Iterator iterator = list.iterator();

            while (iterator.hasNext()) {

                Integer next = (Integer) iterator.next();

                if (next.intValue() == nowFloor) {

                    iterator.remove();
                } else {
                    newList.add(next);
                }
            }

        }

        Integer[] newWait = new Integer[list.size()];

        return newList.toArray(newWait);
    }

    public int calFloor(DianTi dianTi) {

        if (dianTi.getWait() == null || dianTi.getWait().length == 0) {

            return dianTi.getNowFloor();
        }

        System.out.println(JSON.toJSON(dianTi.getWait()));

        Arrays.sort(dianTi.getWait());

        System.out.println(JSON.toJSON(dianTi.getWait()));

        if (dianTi.isUp()) {

            for (int i : dianTi.getWait()) {

                if (i > dianTi.getNowFloor()) {

                    return i;
                }
            }

            dianTi.setUp(false);
        }


        if (!dianTi.isUp()) {

            for (int i = dianTi.getWait().length - 1; i < dianTi.getWait().length; i--) {

                if (i < dianTi.getNowFloor()) {

                    return dianTi.getWait()[i];
                }
            }

            dianTi.setUp(true);

        }

        return dianTi.getNowFloor();
    }

}
