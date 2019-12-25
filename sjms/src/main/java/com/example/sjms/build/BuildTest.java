package com.example.sjms.build;

public class BuildTest {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setGpu("2080Ti");
        computer.setCpu("3900x");
        computer.setMemery("32G");
        computer.setMouse("技嘉G530");
        computer.setDisk("三星980EVO PULS");

        Build build = new LeoveComputerBuild();
        Direcror direcror = new Direcror(build);
        direcror.getComputer(computer);
    }
}
