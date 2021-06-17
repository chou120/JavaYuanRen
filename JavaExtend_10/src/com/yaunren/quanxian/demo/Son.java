package com.yaunren.quanxian.demo;

import com.yaunren.quanxian.Person;

public class Son  extends Person {


    public  void  showInfo(){
        //  System.out.println(name);
       // System.out.println(age);  在不同包下的子类   默认的 不能使用
        System.out.println(address);
        System.out.println(country);

        // show();
       // show2();
        show3();
        show4();


    }

}
