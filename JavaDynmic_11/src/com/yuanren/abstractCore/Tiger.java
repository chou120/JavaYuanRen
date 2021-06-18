package com.yuanren.abstractCore;

public class Tiger extends Animal{


    @Override
    public void sleep() {
        System.out.println(this.getName()+"在睡觉...");
    }
}
