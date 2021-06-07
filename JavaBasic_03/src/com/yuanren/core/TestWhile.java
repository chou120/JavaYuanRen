package com.yuanren.core;

import java.util.Scanner;

public class TestWhile {

    /**
     * 初始化条件
     * while (判断条件){
     *     代码块;
     *     步长;(增长量)
     * }
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入number1:");
        //这是第一个循环案例
     /**  int  number=scanner.nextInt();
        while(number<9){ //1
            System.out.println("我喜欢看美女");//2
            number++; //3
            //number=number+2; //  number+=2;
        }
*/
        //手动输入两个数number1,number2求这两个数中的所有的偶数   5    9
        int  number1=scanner.nextInt();
        System.out.println("请输入number2:");
        int  number2=scanner.nextInt();
        //   去判断number1和number2谁大
       int  max=number1;
       int  min=number2;
       if(max<number2){
           max=number2;
       }
        if(min>number1){  //
            min=number1;
        }
        while(min<max){
            if(min%2==0){
                System.out.println("偶数为："+min);
            }
            min++;
        }
    }
}
