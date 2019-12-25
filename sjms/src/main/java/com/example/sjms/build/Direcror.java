package com.example.sjms.build;

public class Direcror {

    private Build build;

    public Direcror(Build build) {
        this.build = build;
    }

    public Computer getComputer(Computer computer) {

        build.installComputer(computer);

        return build.buildComputer();
    }
}
