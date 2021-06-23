package com.exam.core;

import java.util.Date;

public class Student {

    private String sId;
    private String  stuName;
    private String password;
    private Gender gender;
    private String phone;
    private Integer score;  //考试结束之后才有的分数
    private Date date;   //考试时间 是不是考试结束之后才有的
    private static int  stuNumber=0;

    public Student() {
        this.sId = ++stuNumber+"";
    }

    public Student(String stuName, String password, Gender gender, String phone) {
        this.sId = ++stuNumber+"";
        this.stuName = stuName;
        this.password = password;
        this.gender = gender;
        this.phone = phone;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId='" + sId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", score=" + score +
                ", date=" + date +
                '}';
    }
}
