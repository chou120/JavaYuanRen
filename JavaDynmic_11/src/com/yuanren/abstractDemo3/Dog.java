package com.yuanren.abstractDemo3;

public class Dog  extends  Animal{

    public  String  type="放荡不羁爱自由";

    @Override
    public void show() {
        System.out.println("dog");
    }

    //子类特有的方法

    public  void  method(){
        System.out.println("这是子类特有的方法");
    }

}
class  Test{

    public static void main(String[] args) {
        Animal  animal = new Dog();  //抽象多态
        System.out.println(animal.address+",");
        animal.show();  //在多态的情况下 要去访问子类特有的成员 怎么访问

        //需要进行类型强转
        Dog   dog=(Dog)animal;
        dog.method();



    }
}
