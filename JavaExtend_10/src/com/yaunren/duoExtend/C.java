package com.yaunren.duoExtend;

public class C extends  B {

    @Override
    public void show() {
        System.out.println("孙");
    }
}


class  Test{
    public static void main(String[] args) {
        new  C().show();
    }
}