package com.pojo;

public class TerminationInfo {
    private Integer terminationId;

    private Integer personnelId;

    private String personnelName;

    private String department;

    private String position;

    private String terminationTime;

    private String terminationResult;

    private String stopSalaryTime;

    public Integer getTerminationId() {
        return terminationId;
    }

    public void setTerminationId(Integer terminationId) {
        this.terminationId = terminationId;
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

    public String getTerminationTime() {
        return terminationTime;
    }

    public void setTerminationTime(String terminationTime) {
        this.terminationTime = terminationTime;
    }

    public String getTerminationResult() {
        return terminationResult;
    }

    public void setTerminationResult(String terminationResult) {
        this.terminationResult = terminationResult;
    }

    public String getStopSalaryTime() {
        return stopSalaryTime;
    }

    public void setStopSalaryTime(String stopSalaryTime) {
        this.stopSalaryTime = stopSalaryTime;
    }
}