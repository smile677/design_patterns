package com.smile67.principles.开闭原则_1;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.demo1
 * @Author: smile67~
 * @CreateDateTime: 2/26/2024 - 02 - 26 - 3:45 PM
 * @Description: 搜狗输入法
 * @version: 1.0
 */
public class SougouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
