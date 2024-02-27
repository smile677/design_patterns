package com.smile67.principles.里氏代换原则_2.after;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.demo1.demo2.after
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 11:46 AM
 * @Description: 长方形类
 * @version: 1.0
 */
public class Rectangle implements Quadrilateral {
    private double length;
    private double width;

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
