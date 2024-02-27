package com.smile67.principles.里氏代换原则_2.after;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.demo1.demo2.after
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 11:44 AM
 * @Description: 正方形类
 * @version: 1.0
 */
public class Square implements Quadrilateral{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
