package com.smile67.principles.接口隔离原则_4.after;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.接口隔离原则.after
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 3:34 PM
 * @Description: 测试客户端
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建黑马安全门对象
        HeimaSafetyDoor door = new HeimaSafetyDoor();
        // 调用功能
        door.antiTheft();
        door.fireProof();
        door.waterProof();

        System.out.println("==========");
        // 创建ITcast安全门对象
        ItcastSafetyDoor door1 = new ItcastSafetyDoor();
        // 调用功能
        door1.antiTheft();
        door1.fireProof();
    }
}
