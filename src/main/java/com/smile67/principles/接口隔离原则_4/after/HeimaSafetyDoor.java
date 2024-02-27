package com.smile67.principles.接口隔离原则_4.after;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.接口隔离原则.after
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 3:33 PM
 * @Description: TODO
 * @version: 1.0
 */
public class HeimaSafetyDoor implements AntiTheft,Fireproof,Waterproof{
    @Override
    public void antiTheft() {
        System.out.println("安全门已开启防偷功能2");
    }

    @Override
    public void fireProof() {
        System.out.println("安全门已开启防火功能2");
    }

    @Override
    public void waterProof() {
        System.out.println("安全门已开启防水功能2");
    }
}
