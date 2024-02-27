package com.smile67.principles.接口隔离原则_4.after;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.接口隔离原则.after
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 3:35 PM
 * @Description: 传智安全门
 * @version: 1.0
 */
public class ItcastSafetyDoor implements AntiTheft,Fireproof{
    @Override
    public void antiTheft() {
        System.out.println("防盗3");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }
}
