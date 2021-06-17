package com.yaunren.quanxian;

public class Son extends  Person{

    /**
     *访问权限修饰符
     * ①public：意为公开的，访问权限最高，可以跨包访问。
     * ②protect：意为受保护的，权限次之，可以在同包和子/父类中访问。
     * ③default：意为默认的，一般不写，权限次之，可以在同包中访问。
     * ④private：意为私有的，权限最低，只能在本类中访问。
     * 所以，为了保证安全性，一般把访问权限降到最低。
     *
     *
     *
     */



    public  void  showInfo(){
      //  System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(country);

       // show();
        show2();
        show3();
        show4();

    }

    /**
     * 子类在方法方法重写的时候   重写的方法的访问修饰符的权限要大于等于父类的访问修饰符的权限
     */

    void  show2(){
        System.out.println("这是子类的默认方法");
    }
    protected void  show3(){
        System.out.println("这是子类的protected方法");
    }

    public  void  show4(){
        System.out.println("这是子类的public方法");
    }



}
