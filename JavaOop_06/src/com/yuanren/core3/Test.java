package com.yuanren.core3;

public class Test {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("李四");
        student.setAge(35);

        Student worker = new Student();
        worker.setName("张三");
        worker.setAge(12);
        worker.makeMoney();
        System.out.println(worker.toString());

        student.makeMoney();
        System.out.println(student.toString());

    }

}
