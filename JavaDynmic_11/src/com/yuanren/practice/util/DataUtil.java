package com.yuanren.practice.util;

import com.yuanren.practice.pojo.Business;
import com.yuanren.practice.pojo.Product;

import java.util.Arrays;

public class DataUtil {

    private DataUtil(){

    }
    //当成数据库
    public static Business[] businesses = new Business[0];
    public static Product[] product = new Product[0];


    /**
     * 扩容的方法
     */
    public  static  void  changeBusinessesArrayLength(){
        businesses=  Arrays.copyOf(businesses,businesses.length+1);
    }
    public  static  void  changeProductArrayLength(){
        product=  Arrays.copyOf(product,product.length+1);
    }


    /**
     * 商家注销
     */

    public  static  void  del(Business[] bus){
        businesses=Arrays.copyOf(bus,bus.length-1);
    }


    /**
     * 打印数据
     */
    public static  void  print(){
        System.out.println(Arrays.toString(businesses));
    }
}
