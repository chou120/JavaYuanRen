package com.yuanren.core.array;


import java.util.Scanner;

public class ArrayTest {

    /**
     * 数组的定义:内存中 相同的数据类型的一段连续的存储空间
     */
    public static void main(String[] args) {

        //   数据类型[] 数组名=new   数据类型[长度];//动态数组

        //对数组里面赋值 或者 取出数组里面的数据的格式       数组名[索引(下标)]  索引一般是从0开始的整数
        /**
         * 数组的长度跟索引之间的关系
         *      长度-1=索引最大值
         */

        int[] array = new int[3];  //动态数组系统会给默认值  这个默认值跟定义的数据类型有关系
        /*array[0] = 5;
        array[1] = 7;
        array[2] = 9;*/

        // System.out.println(array[1]);
        String[] str = new String[3]; //null   ""
        str[0] = "周健";
        str[1] = "jax";
        str[2] = "剑姬";

        for (int i = 0; i < 3; i++) {
            System.out.println(str[i]);
        }

        System.out.println(str[0]);
        //课堂练习:使用循环的方式给字符串数组赋值

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数据:");

        String  [] arr=new String[5];
       /* for (int i = 0; i < 3; i++) {
            arr[i]= scanner.next();    //   手动输入字符串
        }

        for (int j = 0; j < 5; j++) {  //一般循环输出的是有效数据
            System.out.println(arr[j]);
        }
*/
        System.out.println(arr);
        System.out.println(array);

        String []  str1=new String[1];

        str1=null;


        arr=null;
        System.out.println(arr[0]);  //NullPointerException

        System.out.println(arr[20]); //java.lang.ArrayIndexOutOfBoundsException: 20











    }
}
