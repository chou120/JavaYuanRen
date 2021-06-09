package com.yuanren.core.homework;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
       /* #### 4.现对一个八位数进行加密，每个位上加5得到的和对10进行取余操作，得到的余数进首尾交换，求最终得到的数据
        如：12345678   87654321  此例子只是作为余数之间的首尾交换演示   String 拼接
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个8位数:");
        int number = scanner.nextInt();   //12345678      6 7 8 9 10 11 12 13    6 7 8 9 0   1  2  3        32109876
        int  yuShu=0;
        int  yuShu2=0;
        String  str="";
        while (number>0){
            yuShu = number%10;
            yuShu2= (yuShu+5)%10;//   3
            str+=yuShu2;
            number=number/10;
        }

        System.out.println("最终结果为:"+str);
    }
}
