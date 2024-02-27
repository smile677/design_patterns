package com.smile67.principles.里氏代换原则_2.before;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.demo1.demo2.before
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 11:21 AM
 * @Description: TODO
 * @version: 1.0
 */
public class RectangleDemo {
    public static void main(String[] args) {
        // 创建长方形
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        printLengthAndWidth(rectangle);
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("-----------------------");
        //创建正方形对象
        Square square = new Square();
        square.setLength(10);
        printLengthAndWidth(square);
        resize(square);
        printLengthAndWidth(square);

    }

    // 扩宽方法
    public static void resize(Rectangle rectangle) {
        // 判断宽如果比长小，进扩宽的操作、
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长和宽
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println("长：" + rectangle.getLength() + "宽：" + rectangle.getWidth());
    }
}
