package com.yuanren.coreArray;

import com.yuanren.core2.Person;

import java.util.Scanner;

public class TestObjectArray {


    public static void main(String[] args) {
       /* Person person = new Person();
        person.setName("李白");
        person.setAddress("玉皇宫");
        person.setAge(120);
        person.setHeight(1.8);
        person.setPassword("123456");

        Person person2 = new Person();
        person2.setName("李白居易");
        person2.setAddress("玉皇宫");
        person2.setAge(10);
        person2.setHeight(1.8);
        person2.setPassword("123456");

        Person person3 = new Person();
        person3.setName("拜占庭");
        person3.setAddress("玉皇宫");
        person3.setAge(15);
        person3.setHeight(1.8);
        person3.setPassword("123456");

        //数据类型 [] 数组名=new 数据类型[长度];    String    类都是引用数据类型     String  [] str=new String[5];
        Person[] persons = new Person[3];
        //将对象存放到对象数组中
        persons[0]=person;
        persons[1]=person2;
        persons[2]=person3;  //对象名.成员

        for (int i = 0; i < persons.length; i++) {
            //获取到的是每一个对象
            System.out.println(persons[i].getName());
        }*/

        Scanner scanner = new Scanner(System.in);

       /*
       Person person = new Person();
       手动赋值写法
       第一种
       String name = scanner.next();
        person.setName(name);

        int age = scanner.nextInt();
        person.setAge(age);

        double height= scanner.nextDouble();
        person.setHeight(height);

      第二种
        person.setName(scanner.next());
        person.setAge(scanner.nextInt());
        person.setHeight(scanner.nextDouble());
        person.setAddress(scanner.next());
        person.setPassword(scanner.next());

      */
        //对  对象数组里面的元素进行动态赋值
        Person[] peoples = new Person[3];
        for (int i = 0; i < peoples.length; i++) {

            Person person1 = new Person();

            System.out.println("请输入第" + (i + 1) + "个对象的名字:");
            person1.setName(scanner.next());

            System.out.println("请输入第" + (i + 1) + "个对象的年龄:");
            person1.setAge(scanner.nextInt());

            System.out.println("请输入第" + (i + 1) + "个对象的身高:");
            person1.setHeight(scanner.nextDouble());

            System.out.println("请输入第" + (i + 1) + "个对象的地址:");
            person1.setAddress(scanner.next());

            System.out.println("请输入第" + (i + 1) + "个对象的密码:");
            person1.setPassword(scanner.next());

            peoples[i]=person1;
        }

        for (int i = 0; i < peoples.length; i++) {
           System.out.println(peoples[i].toString());
           // System.out.println(peoples[i].getAge());
        }

    }
}
