package com.yuanren.abstractCore;

public class Demo {

    public static void main(String[] args) {

        Animal  animal=new Tiger();
        animal.setName("大黄");
        animal.sleep();

        animal=new Lion();
        animal.setName("炸毛");
        animal.sleep();

        Animal animal1 = new Lion();


    }
}
