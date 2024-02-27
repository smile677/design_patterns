package com.smile67.principles.迪米特法则_5;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.迪米特法则_5
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 3:54 PM
 * @Description: 媒体公司类
 * @version: 1.0
 */
public class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
