package com.smile67.principles.迪米特法则_5;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.迪米特法则_5
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 3:54 PM
 * @Description: 粉丝类
 * @version: 1.0
 */
public class Fans {
    private String name;

    public Fans(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
