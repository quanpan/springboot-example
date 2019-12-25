package com.example.sjms.outward.waiguan.moduleB;

public class FaceB {

    private System3 system3;

    private System4 system4;

    public FaceB() {
        this.system3 = new System3();
        this.system4 = new System4();
    }

    public void userFaceB() {

        this.system3.work();
        this.system4.send();
    }
}
