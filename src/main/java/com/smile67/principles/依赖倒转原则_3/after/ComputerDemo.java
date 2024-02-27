package com.smile67.principles.依赖倒转原则_3.after;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.demo3.after
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 12:50 PM
 * @Description: TODO
 * @version: 1.0
 */
public class ComputerDemo {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.setCpu(new IntelCpu());
        c.setHardDisk(new XiJieHardDisk());
        c.setMemory(new KingstonMemory());
        c.run();
    }
}
