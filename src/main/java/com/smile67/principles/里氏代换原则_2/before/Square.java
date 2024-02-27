package com.smile67.principles.里氏代换原则_2.before;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.demo1.demo2.before
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 11:16 AM
 * @Description: 正方形类
 * @version: 1.0
 */
public class Square extends Rectangle {
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
