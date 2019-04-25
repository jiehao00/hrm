package com.pojo;

import java.util.List;

public class PositionInfo {
    private Integer positionId;

    private String position;

    private String positionIntroduction;

    private Integer departmentId;

    private String department;

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getPositionIntroduction() {
        return positionIntroduction;
    }

    public void setPositionIntroduction(String positionIntroduction) {
        this.positionIntroduction = positionIntroduction;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}