package com.yuanren.other;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        System.out.println(   Math.ceil(12.01));
        System.out.println(   Math.floor(12.9999999999999999999));
        System.out.println(Math.round(15.49999));

        int [] arr={1231,1,2,5,4,1,1,34,8,6};   //严谨的来说一般使用二分法查找  数组是有序并且里面没有重复值
        //System.out.println( Arrays.binarySearch(arr,1));

        int[] ints = Arrays.copyOfRange(arr, 2, 5);

        int[] ints1 = Arrays.copyOf(arr, arr.length+1);
        System.out.println(Arrays.toString(ints1));


     /* int  [] newArray=new int[3];
        System.arraycopy(arr,2,newArray,0,newArray.length);
        System.out.println(Arrays.toString(newArray));*/
        int[] ints2 = new int[4];

        Arrays.fill(ints2,(int)(Math.random()*10));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(System.currentTimeMillis());  //1623899924 287    计算机元年是1970 1.1 8:00

        //现在时间是   xxxx年xx月xx日 xx时xx分xx秒

        System.gc(); //调用垃圾回收器
        



    }
}
