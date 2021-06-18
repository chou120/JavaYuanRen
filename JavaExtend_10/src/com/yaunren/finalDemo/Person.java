package com.yaunren.finalDemo;

public  class Person {

    /**
     * 修饰成员   变量    变量变常量   并且要有初始值 不然会报错
     *          方法   final修饰方法的时候可以被子类继承 但是不能被子类重写
     *          类   final修饰类的时候不能被继承
     *  当final修饰局部变量时:
     *              修饰的是引用对象的时候 对象地址不能变 但是其成员的属性值是可以变的
     *
     * final：最终的，最后的；可以修饰类、变量和函数；
     * 修饰类，表示该类不可被继承；格式是直接写在class关键字前面；
     * 修饰函数，表示继承这个类的子类中不能重写这个函数；格式是直接写在函数的返回值类型前面
     * 修饰变量，表示该变量的值不可改变；格式是直接写在变量的数据类型前面；
     * 注意：如果修饰的是引用类型的变量，则变量中保存的引用不可改变，但是引用指向的堆内存中的数据可以改变；
     *
     *
     */
    public   static   final  String  COUNTRY="中国";
    private  final  int  AGE=21;
    public int getAGE() {
        return AGE;
    }
    public  final  void  show(){
        System.out.println("这是父类的final方法");
    }
    public  void  method(final Fruit  fruit,final double price, final String   name){  //直到接受第一个数据时  确定此数据为常量
       //price=61;   错误
       //fruit=new Fruit();  错误
        fruit.setPrice(price);
       // name="dasdas";
    }





}
