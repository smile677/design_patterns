package com.smile67.principles.依赖倒转原则_3.before;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.demo3.before
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 12:12 PM
 * @Description: 希捷硬盘类
 * @version: 1.0
 */
public class XiJieHardDisk  {

    public void save(String data) {
        System.out.println("使用希捷硬盘 存储数据" + data);
    }

    public String get() {
        System.out.println("使用希捷希捷硬盘 取数据");
        return "数据";
    }
}
