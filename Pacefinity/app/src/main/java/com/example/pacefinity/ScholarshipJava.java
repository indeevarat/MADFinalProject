package com.example.pacefinity;

public class ScholarshipJava {
    String scholarship;
    String money;
    String requirement;
    String links;
    String otherinfo;



    public ScholarshipJava(String scholarship, String money, String requirement, String links, String otherinfo) {
        this.scholarship = scholarship;
        this.money = money;
        this.requirement = requirement;
        this.links = links;
        this.otherinfo = otherinfo;
    }
    public String getScholarship() {
        return scholarship;
    }

    public String getMoney() {
        return money;
    }

    public String getRequirement() {
        return requirement;
    }

    public String getLinks() {
        return links;
    }

    public String getOtherinfo() {
        return otherinfo;
    }
}
