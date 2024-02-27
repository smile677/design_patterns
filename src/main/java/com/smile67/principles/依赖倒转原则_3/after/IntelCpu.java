package com.smile67.principles.依赖倒转原则_3.after;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.demo3.before
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 12:28 PM
 * @Description: TODO
 * @version: 1.0
 */
public class IntelCpu implements Cpu {

    @Override
    public void run() {
        System.out.println("使用Intel处理器");
    }
}
