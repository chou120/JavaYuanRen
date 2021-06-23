package com.exam.core;

public enum Gender {
    MALE("男"),FEMALE("女");
    private String  sex;

    Gender(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}
