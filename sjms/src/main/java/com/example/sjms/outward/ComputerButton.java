package com.example.sjms.outward;

public class ComputerButton {

    private Cpu cpu;
    private Memory memory;

    public ComputerButton() {
        cpu = new Cpu();
        memory = new Memory();
        System.out.println("如果我们没有Computer类，那么，CPU、Memory、Disk他们之间将会相互持有实例，产生关系。\n" +
                "这样会造成严重的依赖，修改一个类，可能会带来其他类的修改，这不是我们想要看到的，有了Computer类，他们之间的关系被放在了Computer类里，这样就起到了解耦的作用，\n" +
                "这就是外观模式");
    }

    public void startComputer() {
        cpu.start();
        memory.start();
    }

    public void downComputer() {

        cpu.down();
        memory.down();
    }
}
