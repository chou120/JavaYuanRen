package com.yaunren.quanxian;

public class Person {

    private  String name="王五";
    int  age=12;
    protected  String address="浦东新区";
    public  String  country="china";


    private  void  show(){
        System.out.println("这是父类的private方法");
    }

    void  show2(){
        System.out.println("这是父类的默认方法");
    }
    protected void  show3(){
        System.out.println("这是父类的protected方法");
    }

    public  void  show4(){
        System.out.println("这是父类的public方法");
    }





}
