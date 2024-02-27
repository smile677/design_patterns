package com.smile67.principles.依赖倒转原则_3.before;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.demo3.before
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 12:29 PM
 * @Description: TODO
 * @version: 1.0
 */
public class Computer {
    private IntelCpu intelCpu;
    private KingstonMemory kingstonMemory;
    private XiJieHardDisk xiJieHardDisk;

    public IntelCpu getIntelCpu() {
        return intelCpu;
    }

    public void setIntelCpu(IntelCpu intelCpu) {
        this.intelCpu = intelCpu;
    }

    public KingstonMemory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }

    public XiJieHardDisk getXiJieHardDisk() {
        return xiJieHardDisk;
    }

    public void setXiJieHardDisk(XiJieHardDisk xiJieHardDisk) {
        this.xiJieHardDisk = xiJieHardDisk;
    }
    public void run() {
        System.out.println("计算机运行");
        String data = xiJieHardDisk.get();
        System.out.println("计算机读取数据：" + data);
        intelCpu.run();
        kingstonMemory.save();
    }
}
