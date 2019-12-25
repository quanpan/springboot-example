package com.example.sjms.bridge;

public class BridgeTest {

    public static void main(String[] args) {

        Bridge bridge = new MyBridege();

        Source source1 = new Source1Impl();
        bridge.setSource(source1);

        bridge.bridgeMethod();

        Source source2 = new Source2Impl();
        bridge.setSource(source2);

        bridge.bridgeMethod();

    }
}
