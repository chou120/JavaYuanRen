package com.yuanren.core.homework;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 练习2:请输入任意月份,任意天数,判断是这一年过去了第几天   6月7号

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        System.out.println("请输入几号：");
        int date = scanner.nextInt();

        int daySum = 0;

        switch (month-1) {  //12  1+11     12 5   11
            case 11:   //month是12月份  前十一个月相加
                daySum =daySum+30;
            case 10:
                daySum = daySum+31;
            case 9:
                daySum += 30;
            case 8:
                daySum += 31;
            case 7:
                daySum += 31;
            case 6:
                daySum += 30;
            case 5:
                daySum += 31;
            case 4:
                daySum += 30;
            case 3:
                daySum += 31;
            case 2:    //指的是三月份
                daySum += 28;     //   400  || 100and4
            case 1:
                daySum =daySum+ 31;
            case 0:
                daySum = date+daySum;
        }

        System.out.println("已经过去了："+daySum);



    }
}
