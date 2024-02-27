package com.smile67.principles.里氏代换原则_2.after;



/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.demo1.demo2.after
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 11:47 AM
 * @Description:
 * @version: 1.0
 */
public class RectangleDemo {
    public static void main(String[] args) {
        // 创建长方形
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        printLengthAndWidth(rectangle);
        // 进行扩宽方法
        resize(rectangle);
        printLengthAndWidth(rectangle);

    }

    public static void resize(Rectangle rectangle) {
        // 判断宽如果比长小，进扩宽的操作、
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }
    // 打印长和宽
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println("长：" + quadrilateral.getLength() + "宽：" + quadrilateral.getWidth());
    }
}
