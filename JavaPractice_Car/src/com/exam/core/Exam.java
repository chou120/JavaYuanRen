package com.exam.core;

public class Exam {

    private String   eId;
    private String   title;//题目  1.xxxx ( )
    private String   AnwserA;
    private String   AnwserB;
    private String   AnwserC;
    private String   AnwserD;

    private String   Anwser; //答案
    private Integer  score;//试题分数
    private static int  eNumber=0;


    public Exam(String title, String anwserA, String anwserB, String anwserC, String anwserD, String anwser, Integer score) {
        this.title = title;
        AnwserA = anwserA;
        AnwserB = anwserB;
        AnwserC = anwserC;
        AnwserD = anwserD;
        Anwser = anwser;
        this.score = score;
        this.eId=++eNumber+"";

    }

    public Exam() {
        this.eId=++eNumber+"";
    }

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnwserA() {
        return AnwserA;
    }

    public void setAnwserA(String anwserA) {
        AnwserA = anwserA;
    }

    public String getAnwserB() {
        return AnwserB;
    }

    public void setAnwserB(String anwserB) {
        AnwserB = anwserB;
    }

    public String getAnwserC() {
        return AnwserC;
    }

    public void setAnwserC(String anwserC) {
        AnwserC = anwserC;
    }

    public String getAnwserD() {
        return AnwserD;
    }

    public void setAnwserD(String anwserD) {
        AnwserD = anwserD;
    }

    public String getAnwser() {
        return Anwser;
    }

    public void setAnwser(String anwser) {
        Anwser = anwser;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public static int geteNumber() {
        return eNumber;
    }

    public static void seteNumber(int eNumber) {
        Exam.eNumber = eNumber;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "eId='" + eId + '\'' +
                ", title='" + title + '\'' +
                ", AnwserA='" + AnwserA + '\'' +
                ", AnwserB='" + AnwserB + '\'' +
                ", AnwserC='" + AnwserC + '\'' +
                ", AnwserD='" + AnwserD + '\'' +
                ", score=" + score +
                '}';
    }
}
