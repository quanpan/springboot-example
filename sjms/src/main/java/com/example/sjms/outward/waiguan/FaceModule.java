package com.example.sjms.outward.waiguan;

import com.example.sjms.outward.waiguan.moduleA.FaceA;
import com.example.sjms.outward.waiguan.moduleB.FaceB;

public class FaceModule {

    private FaceA faceA;
    private FaceB faceB;

    public FaceModule() {
        this.faceA = new FaceA();
        this.faceB = new FaceB();
    }

    public void userModule() {

        this.faceA.userFaceA();
        this.faceB.userFaceB();
    }
}
