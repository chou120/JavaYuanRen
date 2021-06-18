package com.yuanren.abstractCore;

public class Lion extends  Animal{

    public Lion() {
    }

    @Override
    public void sleep() {
        System.out.println(this.getName()+"在睡觉");
    }
}
