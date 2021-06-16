package com.yuanren.core;

public class TestPerson {

    public static void main(String[] args) {

        Person person = new Person();  //根据构造函数来创建对象的     构造器
        person.setAge(21);
        person.setName("张三丰");
        System.out.println(person.toString());

        Person person1 = new Person("shsah",34);



    }
}
