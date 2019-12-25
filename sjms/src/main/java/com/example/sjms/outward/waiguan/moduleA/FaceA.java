package com.example.sjms.outward.waiguan.moduleA;

public class FaceA {

    private System1 system1;

    private System2 system2;

    public FaceA() {
        this.system1 = new System1();
        this.system2 = new System2();
    }

    public void userFaceA() {

        this.system1.init();
        this.system2.load();
    }
}
