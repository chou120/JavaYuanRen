package com.yuanren.exception.myException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    public static void check(int   score) throws MyException {  //可以传递1个以上的字符串

        if (score<0) {
            throw new MyException("分数不合法");
        }
    }

    public static void main(String[] args) {

        int   a=12;
        try {
            check(-5);
            a=123;
        } catch (MyException e) {
            e.printStackTrace();
            a=1289;
        }finally {
            a=1237889;
        }
        System.out.println("哈哈啥"+a);

        //时间api
        Date date = new Date();  //获取的是系统时间
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss SSS");
        String format = simpleDateFormat.format(date);
        System.out.println(format);


    }
}
