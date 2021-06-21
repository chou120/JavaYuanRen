package com.yuanren.core;

public class Outer {

    private  static   String  name="外部类";

    private  String  address="哈哈";


    private Inner  inner=new Inner();


    public  void  outShow(){
        new  Inner().show();  //链式书写
    }

    public  static  void  method(){
        System.out.println("我是外部类的静态方法method");
    }



    /**
     * 不建议  使用public
      */
    static class  Inner{

        private  String  name="我是内部类";

        //常量之所以可以（不论是否有static），因为java编译期就确定所有的常量，放到常量池中。
        private  static  final  int  age=12;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        /**
         * 静态内部类中可以有非静态方法
         */
        public  void   show(){
            System.out.println("我是内部类的show"+this.name);
          /*  System.out.println(Outer.this.name);*/
            method();
            System.out.println("静态内部类的非静态方法能不能访问 外部类的静态成员:"+Outer.name+",");  //可以

        }

        /**
         * 内部类中的方法如果是静态的那么这个类一定是静态内部类
         */
        public  static  void   money(){
            System.out.println("静态内部类的静态方法能不能访问 外部类的静态成员:"+Outer.name);

        }







    }





}
