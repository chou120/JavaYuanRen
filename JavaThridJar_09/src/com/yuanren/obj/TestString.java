package com.yuanren.obj;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TestString {

    public static void main(String[] args) {

        String s  = "张三";
        String s1 = new String("张三");
        String s2 ="张三";
        System.out.println(s.equals(s1));

        System.out.println("s:"+s.hashCode());
        System.out.println("s1:"+s1.hashCode());

        System.out.println(s==s1);


        byte [] byt={98,78,99,67,101};
        String s3 = new String(byt);
        System.out.println(s3);
            /*
            s3 = new String(byt,"GBK");
            System.out.println(s3);
      */
        String s4 = new String(byt, 2, 2);
        System.out.println(s4);

        char [] ch={'a','男','女'};
        String s5 = new String(ch);
        System.out.println(s5);


        String  str="脑袋都是你asdasgahskdhw3";  //"123456789"

        char c = str.charAt(0);
        System.out.println(c);
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);   //gbk     GB2312     big5   utf-8      ISO_8859_1
        System.out.println(Arrays.toString(bytes));

        String s6 = new String(bytes);
        System.out.println(s6);


    }
}
