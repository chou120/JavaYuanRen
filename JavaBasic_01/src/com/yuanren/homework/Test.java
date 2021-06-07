package com.yuanren.homework;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //5876
       //可以通过手动输入得到任意数据
        Scanner   scanner=new Scanner(System.in);
        System.out.println("请输入一个四位数:");
        int   number=scanner.nextInt();//手动输入任意整形数据

        int geWei=number%10;
        int shiWei=number/10%10;
        int baiWei=number/100%10;
        int qianWei=number/1000;
        int sum=geWei+shiWei+baiWei+qianWei;

        System.out.println("和是："+sum);


    }

}
