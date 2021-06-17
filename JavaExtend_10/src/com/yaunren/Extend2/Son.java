package com.yaunren.Extend2;

public class Son extends Person {

     public   String  country="岛国";

    /**
     * 问: 当子类和父类成员如果出现一样的话   那么访问先后顺序是?
     * <p>
     * 如果是成员变量一样(非私有化的)?
     * 优先使用子类自己的   如果子类不存在 那么就使用父类的成员变量
     * 如果成员方法是一样的？
     * 优先使用子类自己的  如果子类不存在 那么就使用父类的成员方法
     */

    /***
     * 方法的重写:为什么要进行方法重写  ？
     *      当父类的函数功能已经不满足子类的需求  那么子类就需要对父类的方法进行重写
     *          方法重写的特点:
     *             子类方法和父类方法一致 (方法名一致  参数列表一致 返回值类型一致 ) 具体的实现功能不一样
     *
     */
    public void show() {
        System.out.println("这是子类的show方法....");
    }
    public void show(int   number) {
        System.out.println(super.country+"这是子类的show(参数)方法...."+this.country);
        super.show();
        this.show();
    }

    public  static  void method(){
        System.out.println("这是子类的静态方法");

    }



}
