package com.yuanren.staticcore2;

public class StaticDemo {
    static int i=1;
    static int  a=9;

    static{  //静态代码块
        System.out.println("这是静态代码块....");
        //一般用来做数据的初始化操作
        i++;
        a--;
    }
    public  StaticDemo(){  // .class
        System.out.println("这是无参构造函数...");
        i++;
        a++;
    }

    {   i--;
        System.out.println("构造代码块");
    }


}
class  Test{
    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        StaticDemo staticDem2 = new StaticDemo();
        StaticDemo staticDemo2= new StaticDemo();

        System.out.println(staticDemo2.i);
    }
}