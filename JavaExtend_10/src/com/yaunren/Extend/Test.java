package com.yaunren.Extend;

public class Test {


    /**
     * 1、使用继承，可以让子类直接拥有父类的成员，除了私有的成员和构造函数；
     * 2、虽然使用extends关键字可以在任意两个类之间建立继承关系，在语法上不报错，但是在实际开发中，一般只有两个类有一种关系的时候，才使用继承；
     * 这种关系就是：子类描述的事物  是  父类描述事物的一个特例；
     * 如果说两个类中有重复的成员，但是两个类表示的事物不具有这种 “是” 的关系，这个时候就要找他们两个共同的父类，然后在父类中书写重复的成员，然后让两个类分别继承这个共同的父类；
     * @param args
     */



    public static void main(String[] args) {


        /*Person person = new Person();
        person.setName("张三");
        person.setAge(56);
        person.setSex('男');*/

      /*  Student student = new Student();
        student.setName("张大仙");
        student.setAge(29);
        student.setSex('男');


        Work work = new Work();
        work.setName("周健");
        work.setAge(30);
        work.setSex('男');
*/

       /* student.showInfo();

        System.out.println(person);
        System.out.println(student);
        System.out.println(work);*/


        Student student;/*= new Student("张三分", '男', 109);
        Work work = new Work("李思慕", '女', 26);*/

         student = new Student("张三分", '男', 109,"天马行空");

    }

}
