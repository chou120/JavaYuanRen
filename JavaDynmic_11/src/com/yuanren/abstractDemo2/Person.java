package com.yuanren.abstractDemo2;

public abstract class Person {

    //一般情况下抽象类中只写抽象方法  成员变量或者常量具体情况具体对待
    public final static String COUNTRY = "中国";
    public Integer age = 12;
    private String address;



    public abstract void makeMoney();

    public abstract void addData();

    public void show() {

    }
}

abstract class Son extends Person {

}
class GrandSon extends Son {
    @Override
    public void makeMoney() {
    }
    @Override
    public void addData() {
    }
    public void show(int num) {
        System.out.println("这是子类的show2");
    }
    @Override
    public void show() {
        System.out.println("这是子类的show");
    }
}