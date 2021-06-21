package com.yuanren.intefaceDemo.pra;

import java.util.List;

public class A  extends  Other implements  ControlData,ControlData2{


    /**
     * 接口里面的方法在jdk1.8之前都是抽象方法
     *
     *      1.8之后可以有默认方法
     *
     *      接口可以多实现（多继承）  但是普通的类或者抽象类就不能有多继承
     *
     */


    public     void  show(){

    }

    public   void  method(){

    }


    @Override
    public void change() {

    }
}
