package com.yuanren.homework;

public class TestStringBuffer {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("张三");
        stringBuffer.append('男');
        stringBuffer.append("浦东兴趣");
        stringBuffer.append("月工资3万");

        System.out.println(stringBuffer.toString());
        System.out.println(stringBuffer.reverse(2,6));


    }
}
