package com.yuanren.core;

import com.yuanren.core.Elephant;

import java.util.Scanner;

public class SecondElephant {


    //第二个大象的info行为想要使用 第一个大象的属性  并且可能属性还会产生变化
    public static void main(String[] args) {

        //类名  对象名=new  类名();
        Elephant  elephant=new Elephant();//创建一个大象的对象    new 对象
        //如果想要使用对象的成员(属性的信息,行为)  对象名.成员(属性或者方法)

     /*   System.out.println("大象的名字为:"+elephant.name+",年龄="+elephant.age
        +",性别="+elephant.sex+",体重="+elephant.weight+",身高="+elephant.height);*/

        Elephant  elephant2=new Elephant();//创建一个大象的对象    new 对象
        //如果想要使用对象的成员(属性的信息,行为)  对象名.成员(属性或者方法)
        elephant2.name="张三丰";
        /*elephant2.age=120;

        //改变其中某个大象对象的值
        System.out.println("大象的名字为:"+elephant2.name+",年龄="+elephant2.age
                +",性别="+elephant2.sex+",体重="+elephant2.weight+",身高="+elephant2.height);
*/
        /*int [] arr={231,4124,5};
        int [] arr2=arr; //数组的指针(地址)*/

        Elephant  elephant3=elephant;  //在内存中的地址
        System.out.println(elephant.hashCode()+":"+elephant3.hashCode());

        /*elephant3.age=89;

        System.out.println(elephant.age+"\t"+ elephant3.age);*/

        //引用数据类型  类   接口  数组  等等

       // elephant3.age=-123;  //语法没错 但是现实逻辑错误  年龄不存在负数    如果想要对大象进行正确的赋值操作  可在赋值之前做判断

        Scanner scanner = new Scanner(System.in);
        int age=scanner.nextInt();
         elephant3.setAge(age);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+elephant3.getAge());

        Elephant elephant4= new Elephant();
        System.out.println("小象对自己年龄不满意,要重新设置:");
        age=scanner.nextInt();

        elephant4.setAge(age);

        System.out.println(elephant4.getAge());
    }
}
