package com.smile67.principles.迪米特法则_5;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.迪米特法则_5
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 3:53 PM
 * @Description: 明星类
 * @version: 1.0
 */
public class Start {
    private String name;

    public Start(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
