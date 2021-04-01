package com.terryxi.datacenter.vo;

public class SaleStatisticsVO {
    private String groupName;
    private String nickName;
    private String totalAmount;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "SaleStatisticsVO{" +
                "groupName='" + groupName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                '}';
    }
}
