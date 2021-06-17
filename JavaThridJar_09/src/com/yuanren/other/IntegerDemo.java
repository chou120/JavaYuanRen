package com.yuanren.other;

import java.math.BigInteger;

public class IntegerDemo {


    public static void main(String[] args) {
        //包装类      对基本数据类型的包装
        /**
         *    byte   short   int       long   float     double  boolean      char
         *    Byte   Short   Integer   Long   Float     Double  Boolean      Character
         *
         *    作用:对数据类型之间的相互转换   字符串
         *
         */
        String  str="123456";
        Integer integer=new Integer(str);  // 自动拆箱
       // int i = integer.intValue();

        System.out.println(integer+5);

        Integer i=45; //new   Integer(45);   自动装箱
        int  index=12;     //  int

        System.out.println(i+index);

        System.out.println(Integer.valueOf(str));  //将数字字符串装换成int
        System.out.println(Integer.parseInt("54987"));

        //判断字符是否是数字
        System.out.println(Character.isDigit('a')+"\t"+Character.isDigit('1'));
        String  str1="afgad 54 asdaw 5 asdw 25 taw 8 w";

        /**
         *  BigDecimal
         *
         *  BigInteger
         *
         */


    }
}
