package com.yaunren.Extend;

public class Work  extends  Person{
    public Work() {
        System.out.println("这是work的构造函数");
    }


    public Work(String name, Character sex, Integer age) {
        super(name, sex, age);
        System.out.println("这是子类的有参构造");
    }
}
