package com.example.sjms.build;

public class LeoveComputerBuild extends Build {

    @Override
    public void installComputer(Computer computer) {
        this.computer.setCpu(computer.getCpu());
        this.computer.setGpu(computer.getGpu());
        this.computer.setDisk(computer.getDisk());
        this.computer.setMemery(computer.getMemery());
        this.computer.setMouse(computer.getMouse());
    }

    @Override
    public Computer buildComputer() {
        return this.computer;
    }
}
