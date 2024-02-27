package com.smile67.principles.开闭原则_1;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.demo1
 * @Author: smile67~
 * @CreateDateTime: 2/26/2024 - 02 - 26 - 3:47 PM
 * @Description: 测试客户端 开闭原则：对扩展开放，对修改关闭
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 1. 创建搜狗输入法对象
        SougouInput sougouInput = new SougouInput();

        // 2. 创建皮肤对象
//        DefaultSkin skin = new DefaultSkin();
//        Smile67Skin skin = new Smile67Skin();
        // 开闭原则：对扩展开放，对修改关闭
        IotSkin skin = new IotSkin();
        // 3. 将皮肤设置到输入法中
        sougouInput.setSkin(skin);
        // 4. 显示皮肤
        sougouInput.display();
    }
}
