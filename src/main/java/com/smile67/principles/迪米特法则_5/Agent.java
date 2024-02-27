package com.smile67.principles.迪米特法则_5;

/**
 * @BelongsProject: IntelliJ IDEA
 * @BelongsPackage: com.smile67.principles.迪米特法则_5
 * @Author: smile67~
 * @CreateDateTime: 2/27/2024 - 02 - 27 - 3:55 PM
 * @Description: 经纪公司类
 * @version: 1.0
 */
public class Agent {
    private Start start;
    private Fans fans;
    private Company company;

    public Start getStart() {
        return start;
    }

    public void setStart(Start start) {
        this.start = start;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    // 和粉丝见面
    public void meeting() {
        System.out.println(start.getName() + "和粉丝见面" + fans.getName());
    }

    // 和媒体公司洽谈
    public void negotiate() {
        System.out.println(start.getName() + "和媒体公司" + company.getName() + "洽谈");
    }
}
