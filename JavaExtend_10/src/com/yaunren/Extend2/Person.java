package com.yaunren.Extend2;

public class Person {

    private  String name ="张大炮";
    private  String address="河西走廊";
    public   String  country="中国";


    public  void show(){
        System.out.println("这是父类的show方法....");
    }


    /**
     * 如果父类中出现static 修饰此成员(方法)  那么 被static修饰的方法  会不会被子类继承   会不会被子类重写
     *
     *      被静态修饰的方法不能算是发生方法重写 ?  为什么 ？  在上多态的讲
     *
     */

    public  static  void method(){
        System.out.println("这是父类的静态方法");

    }


    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
