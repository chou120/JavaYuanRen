package com.yuanren.core.homework;

import java.util.Arrays;

public class Test1 {

    //数组去重 1.去除上述数组中的重复数据，并且对去除之后的数组进行排序
    public static void main(String[] args) {

        int[] arr={12,2,9,77,9,8,77,9,25,77,4,2,35};   //
        sort(arr);
        //首先排序
        System.out.println(Arrays.toString(arr));

        int[] distinct = distinct(arr);
        System.out.println(Arrays.toString(distinct));
    }
    //写一个扩容的方法
    public  static  int[]  changeSize(int[] arr){
        //扩容的同时 保证原有的数据存在
        int[] ints = new int[arr.length + 1];  //动态创建int类型的数组的默认值为0
        for (int i = 0; i <arr.length; i++) {
            ints[i]=arr[i];
        }
        return ints;
    }

    //数组去重的方法
    public  static  int []  distinct(int [] arr){
        //在去重之前要先考虑创建的新的数组在不浪费空间内存的情况下，每添加一个数.数组在添加数据之前进行扩容
        int [] newArray=new int[0]; //刚开始长度未0
        int[] changeSizeArray = changeSize(newArray);  //因为要将arr里面的数据放到newArray 但是newArray长度为0  需要进行扩容
        /**
         * 如果按上述的要求来做  那么就意味着多一步操作
         *          将newArray里面的已有的数据重新放到  扩容之后的数组（newArray）中去  多了一步循环赋值的操作
         */
        //把arr 里面的数据放到新的数组newArray里面
        for (int i = 0; i < arr.length; i++) {
                int   temp=arr[i];
                for (int j = i+1; j <arr.length; j++) {
                    if(temp==arr[j]){
                        break; //跳出本次循环
                    }else{
                        //永远往新数组的最后一个位置添加
                        changeSizeArray[changeSizeArray.length-1]=arr[i];//2
                        changeSizeArray = changeSize(changeSizeArray);
                        break;
                    }
                }
                if(i==arr.length-1){
                    changeSizeArray[changeSizeArray.length-1]=arr[i];//2
                }
        }
        return changeSizeArray;
    }
    //首先进行排序
    public  static  void   sort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int  temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
