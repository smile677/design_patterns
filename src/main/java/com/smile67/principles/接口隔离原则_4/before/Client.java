package com.smile67.principles.接口隔离原则_4.before;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.接口隔离原则.before
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 3:29 PM
 * @Description: TODO
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        HeimaSafetyDoor door = new HeimaSafetyDoor();
        door.antiTheft();
        door.waterProof();
        door.fireProof();
    }
}
