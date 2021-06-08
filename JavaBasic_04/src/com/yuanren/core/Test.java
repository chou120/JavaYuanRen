package com.yuanren.core;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {  //主方法 程序启动
        //请输入任意一个数  形成  n*n的一个乘法表
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int  n=scanner.nextInt();


        int  su=sum(n,8);  //实际参数   调用者这一方调用的方法的括号里面的叫实际参数
        System.out.println("和是："+su);


        //

        String   str="我是你们接触的第一个字符串";
        String str1 = getStr(str);
        System.out.println(str1);

    }


    public  static  String   getStr(String  string){  //字符串加工厂

        string=string+"老婆";

        return string;
    }





    public static int  sum(int  x,int y){  //   括号里面的叫形式参数
        //int   total=x+y+65;
        return x+y+65;  //sum 就是返回值

    }


    /**
     * 修饰符 返回值类型 函数名(形式参数类型1  参数名1,形式参数类型2  参数名2......){
     *      函数体语句;
     *  return 返回值;
     * }
     * @param number
     */


    public  static  void  mul(int  number){  //  7   8  9  括号里的叫形参

        for (int i = 1; i <=number; i++) {
            for (int j = 1; j<=i; j++) {     //1*1=1
                //1*2=2  2*2=4
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }

    }

}
