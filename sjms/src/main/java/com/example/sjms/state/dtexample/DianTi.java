package com.example.sjms.state.dtexample;

public class DianTi {

    private int nowFloor;

    private boolean up = true;

    private Integer[] wait;

    private static DianTi dt = null;

    private DianTi() {
    }

    static synchronized private void getInstance() {
        if (dt == null) {

            dt = new DianTi();
        }
    }

    public static DianTi getDianTi() {
        if (dt == null) {
            getInstance();
        }
        return dt;
    }


    public int getNowFloor() {
        return nowFloor;
    }

    public void setNowFloor(int nowFloor) {
        this.nowFloor = nowFloor;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public Integer[] getWait() {
        return wait;
    }

    public void setWait(Integer[] wait) {
        this.wait = wait;
    }
}
