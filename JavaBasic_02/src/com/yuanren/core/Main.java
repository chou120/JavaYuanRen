package com.yuanren.core;

import java.util.Scanner;

public class Main {

    /**
     * if( 判断的条件)
     * {
     * 判断成立后应该执行的动作;
     * }
     * <p>
     * 判断的条件：结果为true或者false的表达式
     * 注意： 这里的判断条件最后必须是一个boolean值,
     * 如果判断条件是true，则执行if后面的{}中的内容；
     * 如果判断条件是false，则跳过大括号中的内容，向下继续执行其他内容。
     *
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int number1 = scanner.nextInt();
        /*System.out.println("请输入第二个数：");
        int number2=scanner.nextInt();*/
/*

        if(number1>number2 && number1-number2>number2){
            System.out.println("第一个数大");
        }
*/

        /*if(number1>number2 && number1-number2>number2){
            System.out.println("第一个数大");
        }else {
            System.out.println("第二个数大");
        }
*/

       /* if(number1++>number2 && number1-number2>number2){
            System.out.println("第一个数大"+number1);
        }else if(number1++>2){
            System.out.println("第二个数大"+number1);
        }else if(number1++>4){
            System.out.println("第3个数大"+number1);
        }else{
            System.out.println("第4个数大"+number1);
        }
*/

        /**
         * 手动输入五各年龄,0~3 婴幼儿    3~12  儿童   12~17青少年   18~27  青年    28以上老年人
         *
         */


        //
        /*switch (整形,字符型,字符串,枚举){

            case 满足条件的选项1:
                代码
            break;
            ...


            default:
                代码;
                break;
        }*/
        /*switch (number1) {
            case 1:
                System.out.println("today   is  Monday");
                break;
            case 2:
                System.out.println("today   is  Tuesday");
               // break;
            case 3:
                System.out.println("today   is  Wednesday");
               // break;
            case 4:
                System.out.println("today   is  thursday");
               // break;
            case 5:
                System.out.println("today   is  Friday");
               // break;
            case 6:
                System.out.println("today   is  星期六");
              //  break;
            case 7:
                System.out.println("today   is  Sunday");
             //   break;
            default:
                System.out.println("您输入的有误....");
                break;
        }*/

        switch (number1){
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("是婴幼儿阿大声道");
                break;
        }




    }
}
