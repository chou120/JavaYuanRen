package com.yuanren.core7;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectStreamDemo {

    /**
     * xxx,xxx,xxx,xxx
     * xxx,xxx,xxx,xxx
     * xxx,xxx,xxx,xxx
     */

    public static void main(String[] args) throws IOException {
        File file = new File("JavaFile_16/student.txt");

        if (!file.exists()) {
            file.createNewFile();
        }
       /* Student student1 = new Student(1, "张三", 23, "白天区");
        Student student2 = new Student(2, "张三", 24, "黑白进区");
        Student student3 = new Student(3, "张三", 25, "妖艳区");

        List<Student> students = Arrays.asList(student1, student2, student3);

        BufferedWriter  bufferedWriter=new BufferedWriter(new FileWriter(file,true));
        for (Student student : students) {
            bufferedWriter.write(student.getId()+"");
            bufferedWriter.write(",");
            bufferedWriter.write(student.getName());
            bufferedWriter.write(",");
            bufferedWriter.write(student.getAge()+"");
            bufferedWriter.write(",");
            bufferedWriter.write(student.getAddress());
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }

        */

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        List<Student> students = new ArrayList<>();
        String str = bufferedReader.readLine();  //1,张三,23,白天区
        while (str != null) {
            String[] split = str.split(",");
            Student student = new Student();
            student.setId(Integer.valueOf(split[0]));
            student.setName(split[1]);
            student.setAge(Integer.valueOf(split[2]));
            student.setAddress(split[3]);
            students.add(student);

            str = bufferedReader.readLine();

        }

        for (Student student : students) {
            System.out.println(student.toString());
        }

    }

}

class Student {

    private Integer id;
    private String name;
    private Integer age;
    private String address;

    public Student() {
    }

    public Student(Integer id, String name, Integer age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}



