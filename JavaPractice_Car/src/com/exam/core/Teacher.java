package com.exam.core;

public class Teacher {

    private String  id;
    private String name;
    private Gender sex;
    private String iphone;
    private String password;
    private static int num=0;

    public Teacher(String name, Gender sex, String iphone, String password) {
        this.name = name;
        this.sex = sex;
        this.iphone = iphone;
        this.password = password;
        this.id=++num+"";
    }

    public Teacher() {
        this.id=++num+"";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", iphone='" + iphone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
