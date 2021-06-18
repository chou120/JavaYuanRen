package com.yuanren.abstractCore;

public abstract class Animal {

    private String   name;
    private  Integer  age;

    //如果一个类中的方法没有方法体  那么这个类一定是抽象类

    /**
     * 抽象类里面的方法 可以有抽象方法   可以有普通方法  也可以有静态方法
     *
     *  抽象方法的具体实现就是看子类的重写
     *
     */
    public abstract void  sleep();


    public  Animal(){
        System.out.println("我是animal无参构造....");
    }

    public  static void  show(){
        System.out.println("抽象类中的静态方法....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
