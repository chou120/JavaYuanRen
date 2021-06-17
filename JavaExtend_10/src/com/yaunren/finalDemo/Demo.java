package com.yaunren.finalDemo;

public class Demo {


    public static void main(String[] args) {

        new Son().show();

        Fruit fruit = new Fruit();
        fruit.setName("西梅");
        fruit.setPrice(12);
        new   Person().method(fruit,9.0,"张三分");

        System.out.println(fruit.toString());


    }


}
