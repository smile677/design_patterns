package com.smile67.principles.依赖倒转原则_3.before;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.demo3.before
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 12:33 PM
 * @Description: TODO
 * @version: 1.0
 */
public class ComputerDemo {
    public static void main(String[] args) {
        // 创建对象
        IntelCpu intelCpu = new IntelCpu();
        KingstonMemory kingstonMemory = new KingstonMemory();
        XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();

        // 创建计算机对象
        Computer computer = new Computer();
        // 组状态计算机
        computer.setIntelCpu(intelCpu);
        computer.setKingstonMemory(kingstonMemory);
        computer.setXiJieHardDisk(xiJieHardDisk);
        // 运行计算机
        computer.run();
    }
}
