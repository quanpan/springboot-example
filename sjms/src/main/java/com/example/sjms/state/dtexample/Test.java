package com.example.sjms.state.dtexample;

public class Test {

    public static void main(String[] args) {

        DianTi dianTi = DianTi.getDianTi();
        dianTi.setNowFloor(9);
        Integer[] wait = {4, 17, 11, 2, 1, 16, 5, 12, 8, 14, 13, 6};
        dianTi.setWait(wait);


//        ClientImpl client = new ClientImpl(new StopState(), dianTi);
//        ClientImpl client = new ClientImpl(ClientImpl.closeState, dianTi);
//        ClientImpl client = new ClientImpl(new RunState(), dianTi);
        ClientImpl client = new ClientImpl(new OpenState(), dianTi);

//        client.stop();

//        client.colse();
        client.colse();

//        client.open();

    }
}
