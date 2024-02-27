package com.smile67.principles.依赖倒转原则_3.after;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.demo3.after
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 12:44 PM
 * @Description: 硬盘接口
 * @version: 1.0
 */
public interface HardDisk {
    // 存储数据
    public void save(String data);

    // 获取数据
    public String get();
}
