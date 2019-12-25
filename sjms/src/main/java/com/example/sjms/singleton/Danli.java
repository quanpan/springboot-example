package com.example.sjms.singleton;

public class Danli {

    private static Danli danliObj = null;

    private Danli() {
    }

    private static synchronized void createInstance() {

        if (danliObj == null) {

            danliObj = new Danli();
        }


    }

    public static Danli getInstance() {

        if (null == danliObj) {

            createInstance();
        }

        return danliObj;
    }


}
