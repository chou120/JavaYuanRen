package com.yuanren.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo {

    public static void main(String[] args) {


       /* int [] arr={213,41,231,23412,2};
        System.out.println(arr[9]);  //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9


        for (int i = 0; i < 20; i++) {
            System.out.println("哈沙河市");
        }*/

        //日期转换

        String   str="2021-0622";
        SimpleDateFormat  simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            simpleDateFormat.parse(str);
            int  i=1/0;

        } catch (ParseException | ArithmeticException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("和啥啥啥");
    }
}
