package com.example.sjms.build;

public abstract class Build {

    protected Computer computer = new Computer();

    abstract public void installComputer(Computer computer);

    abstract public Computer buildComputer();
}
