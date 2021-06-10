package com.yuanren.core.homework;

import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {

        String[] str = {"张梦然", "陶国强", "jax", "马泽高", "关羽", "奇案疑云"};
        str = add(str, "李鑫", 3);

        System.out.println(Arrays.toString(str));

        str=delete(str,5);

        System.out.println(Arrays.toString(str));


    }


    /**
     * @param arr    目标数组
     * @param number 要添加的数据
     * @param index  指定的位置
     */

    public static String[] add(String[] arr, String number, int index) {   //下表+1=长度

        if(arr==null || number==null){
            return null;
        }
        if(index-1< 0 || index > arr.length){
            return null;
        }

        String[] strings = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            strings[i]=arr[i];
        }
        System.out.println(Arrays.toString(strings));
        //插入指定的位置
        for (int i = strings.length-1; i >=index ; i--) {
            strings[i]=strings[i-1];
        }
        strings[index-1]=number;
        return strings;
    }

    /**
     * @param arr    目标数组
     * @param number 要删除的数据的下标
     */
    public static String[] delete(String[] arr, int number) {

        if(arr==null ){
            return null;
        }
        if(number-1< 0 || number > arr.length){
            return null;
        }
        arr[number-1]=null;

        String[] str = new String[arr.length - 1];  //减容
        int  index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                str[index++]=arr[i];
            }

        }
        return str;
    }
}
