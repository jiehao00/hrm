package com.pojo;

public class PunishmentInfo {
    private Integer punishmentId;

    private Integer personnelId;

    private String personnelName;

    private String department;

    private String position;

    private String finedMoney;

    private String punishTime;

    private String punishResult;

    private String startTime;
    private String endTime;

    public Integer getPunishmentId() {
        return punishmentId;
    }

    public void setPunishmentId(Integer punishmentId) {
        this.punishmentId = punishmentId;
    }

    public Integer getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(Integer personnelId) {
        this.personnelId = personnelId;
    }

    public String getPersonnelName() {
        return personnelName;
    }

    public void setPersonnelName(String personnelName) {
        this.personnelName = personnelName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFinedMoney() {
        return finedMoney;
    }

    public void setFinedMoney(String finedMoney) {
        this.finedMoney = finedMoney;
    }

    public String getPunishTime() {
        return punishTime;
    }

    public void setPunishTime(String punishTime) {
        this.punishTime = punishTime;
    }

    public String getPunishResult() {
        return punishResult;
    }

    public void setPunishResult(String punishResult) {
        this.punishResult = punishResult;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}