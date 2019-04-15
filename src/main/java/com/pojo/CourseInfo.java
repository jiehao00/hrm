package com.pojo;

public class CourseInfo {
    private Integer courseCode;

    private String courseName;

    private String courseDepartment;

    private String studentsType;

    private String teachingHours;

    private String plannedStartTime;

    private String plannedEndTime;

    private String actualStartTime;

    private String actualEndTime;

    private String accruedHeadcount;

    private String attendHeadcount;

    private String courseIntroduction;

    /**
     * 没开课：0
     * 已经开课：1
     * 已结课：2
     */
    private String courseStatus;

    public Integer getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(Integer courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(String courseDepartment) {
        this.courseDepartment = courseDepartment;
    }

    public String getStudentsType() {
        return studentsType;
    }

    public void setStudentsType(String studentsType) {
        this.studentsType = studentsType;
    }

    public String getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(String teachingHours) {
        this.teachingHours = teachingHours;
    }

    public String getPlannedStartTime() {
        return plannedStartTime;
    }

    public void setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
    }

    public String getPlannedEndTime() {
        return plannedEndTime;
    }

    public void setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
    }

    public String getActualStartTime() {
        return actualStartTime;
    }

    public void setActualStartTime(String actualStartTime) {
        this.actualStartTime = actualStartTime;
    }

    public String getActualEndTime() {
        return actualEndTime;
    }

    public void setActualEndTime(String actualEndTime) {
        this.actualEndTime = actualEndTime;
    }

    public String getAccruedHeadcount() {
        return accruedHeadcount;
    }

    public void setAccruedHeadcount(String accruedHeadcount) {
        this.accruedHeadcount = accruedHeadcount;
    }

    public String getAttendHeadcount() {
        return attendHeadcount;
    }

    public void setAttendHeadcount(String attendHeadcount) {
        this.attendHeadcount = attendHeadcount;
    }

    public String getCourseIntroduction() {
        return courseIntroduction;
    }

    public void setCourseIntroduction(String courseIntroduction) {
        this.courseIntroduction = courseIntroduction;
    }

    public String getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus;
    }
}