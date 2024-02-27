package com.smile67.principles.依赖倒转原则_3.after;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.demo3.after
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 12:48 PM
 * @Description: TODO
 * @version: 1.0
 */
public class Computer {
    private Cpu cpu;
    private Memory memory;
    private HardDisk hardDisk;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void run() {
        System.out.println("计算机运行");
        String data = hardDisk.get();
        System.out.println("计算机读取数据：" + data);
        cpu.run();
        memory.save();
        System.out.println("计算机工作");
    }

}
