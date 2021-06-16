package com.yuanren.core;

public class Person {


    private  String  name;
    private   int  age;

    /**
     * 修饰符   类名(参数列表...){
     *
     * }
     * 构造函数是用来创建对象的
     *
     * 无参构造函数如果不显示存在   那么jvm会默认提供一个无参构造函数
     * @return
     */
    public   Person(){
        System.out.println("无参构造器...");
    }
    public  Person(String  name){
        this.name=name;
    }
    public  Person(String  name,int  age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
