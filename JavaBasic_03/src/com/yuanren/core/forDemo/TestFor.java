package com.yuanren.core.forDemo;

public class TestFor {


    public static void main(String[] args) {


        /**
         * for(初始化;判断条件;步长){
         *     1      2     4
         *  代码;  3
         * }
         *
         * 嵌套循环   外面走一次  内层循环走一轮
         *
         *
         *
         */
        for (int i = 0; i < 4; i++) {   // 1234  234  234
            for (int j = 0; j < 5; j++) {  //1234  234 234
                System.out.println("这是外层循环的第"+(i+1)+"次,是内层循环的第"+(j+1)+"次");
            }
        }

        /**
         * for(初始化1;判断条件2;步长3){
         *     for(初始化4;判断条件5;步长6){
         *             7代码块;
         *      }
         *     }
         *  124576  576  576 576(内层循环走完了)   3    外层循环第1遍结束
         *  24576   576  576 576(内层循环走完了)   3    外层循环第2遍结束
         *  24576   576  576 576(内层循环走完了)   3    外层循环第3遍结束
         *
         */


       /* for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        */
       /*
        打印出下面图案
        *
        **
        ***
        ****
        *****

        */
      /*  for (int i = 0; i < 5; i++) { // i表示行数  也是表示循环次数
            for (int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/
      /*  for (int i = 1; i <=9; i++) {
            for (int j = 1; j<=i; j++) {     //1*1=1
                //1*2=2  2*2=4
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
*/




    }
}
