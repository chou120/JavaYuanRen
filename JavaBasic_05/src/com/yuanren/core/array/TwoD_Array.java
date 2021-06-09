package com.yuanren.core.array;

import java.util.Scanner;

public class TwoD_Array {


    public static void main(String[] args) {

        //String [][] str=new String[3][3];

        Scanner scanner = new Scanner(System.in);
       /* for (int i = 0; i <str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.println("请给第"+(i+1)+"的第"+(j+1)+"个数据进行赋值:");
                str[i][j]= scanner.next();
            }
        }

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j <str[i].length ; j++) {
                System.out.println("第"+(i+1)+"的第"+(j+1)+"个数据是:"+str[i][j]);
            }
        }
        */

        String[][] strings = new String[2][];
        strings[0]=new String[5];
        strings[1]=new  String[4];


        System.out.println(strings);
        System.out.println(strings[0]);



        String[] [] str1={{"张三"},{"李四","王五"},{"找留","田七","吴八"}};



    }
}
