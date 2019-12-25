package com.example.sjms.state.dtexample;

public class ClientImpl {

    private AbstactStateOperate operate = null;

    private DianTi dianTi;

    public ClientImpl(AbstactStateOperate operate, DianTi dianTi) {
        this.dianTi = dianTi;
        this.operate = operate;
    }

    public DianTi getDianTi() {
        return dianTi;
    }

    public void setDianTi(DianTi dianTi) {
        this.dianTi = dianTi;
    }

    public AbstactStateOperate getOperate() {
        return operate;
    }

    public void setOperate(AbstactStateOperate operate) {
        this.operate = operate;
    }

    public ClientImpl open() {
        this.operate.open(this);
        return this;
    }


    public ClientImpl colse() {
        this.operate.colse(this);
        return this;
    }


    public ClientImpl run() {
        this.operate.run(this);
        return this;
    }


    public ClientImpl stop() {
        this.operate.stop(this);
        return this;
    }
}
