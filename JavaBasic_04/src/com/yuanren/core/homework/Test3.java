package com.yuanren.core.homework;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int number = scanner.nextInt();
        //将每个位上的数单独取出来   123456    654321
        String str = "";
        int yuShu = 0;
        while (number > 0) {  //number!=0
            yuShu = number % 10;  //到这步  就可以得到各个位上的数
            str += yuShu;
            number = number / 10;   //12345
        }
        System.out.println("最终结果为:" + str);
    }
}
