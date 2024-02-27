package com.smile67.principles.迪米特法则_5;


//import sun.management.resources.agent;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.迪米特法则_5
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 3:58 PM
 * @Description: 测试类
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建经纪人类
        Agent agent = new Agent();

        // 创建明星对象
        Start start = new Start("张三");
        agent.setStart(start);
        // 创建粉丝对象
        Fans fans = new Fans("李四");
        agent.setFans(fans);
        // 创建媒体公司对象
        Company company = new Company("腾讯");
        agent.setCompany(company);

        // 和粉丝见面
        agent.meeting();
        agent.negotiate();
    }

}
