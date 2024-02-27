package com.smile67.principles.接口隔离原则_4.before;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.接口隔离原则.before
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 3:29 PM
 * @Description: 黑马安全门
 * @version: 1.0
 */
public class HeimaSafetyDoor implements SafetyDoor{
    @Override
    public void antiTheft() {
        System.out.println("安全门已开启防偷锁");
    }

    @Override
    public void fireProof() {
        System.out.println("安全门已开启防火锁");
    }

    @Override
    public void waterProof() {
        System.out.println("安全门已开启防水锁");
    }
}
