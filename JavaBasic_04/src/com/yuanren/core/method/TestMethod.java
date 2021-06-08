package com.yuanren.core.method;

import java.util.Scanner;

public class TestMethod {
    /**
     *
     //需求：1.求出  整形  浮点型  字符型  这三种类型中的一个类型 两个数求和   （刚开始是不确定到底是什么类型的数据）



     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数据：");
        double v1 = scanner.nextDouble();
        System.out.println("请输入2个数据：");
        double v2 = scanner.nextDouble();

        double sum = sum(v1, v2);

        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();

        sum(i1,i2);

        sum(1.0,1);


    }
    //方法的重载：方法名一样 参数列表不一样 和返回值没有任何关系
    public  static  double sum(double  x,int y){
        return  x+y;
    }
    public  static  int sum(int  x,int y){
        return  x+y;
    }
    public  static  double sum(double  x,double y){
        return  x+y;
    }
    public  static  char sum(char  x,char y){

        return  (char)(x+y);
    }




}
