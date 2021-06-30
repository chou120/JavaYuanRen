package com.yuanren.core8;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ObjectStream {

    /**
     * 序列化（Serialization）是将对象的状态信息转化为可以存储或者传输的形式的过程，一般将一个对象存储到一个储存媒介，
     * 例如档案或记忆体缓冲等，在网络传输过程中，可以是字节或者XML等格式；
     * 而字节或者XML格式的可以还原成完全相等的对象，这个相反的过程又称为反序列化；
     *
     *
     * 对象序列化机制（object serialization）是java语言内建的一种对象持久化方式，通过对象序列化，
     * 可以将对象的状态信息保存未字节数组，并且可以在有需要的时候将这个字节数组通过反序列化的方式转换成对象，
     * 对象的序列化可以很容易的在JVM中的活动对象和字节数组（流）之间进行转换。
     *
     * @param args
     */


    public static void main(String[] args) {
        Student student1 = new Student(1, "张三", 23, "白天区");
        Student student2 = new Student(2, "张三", 24, "黑白进区");
        Student student3 = new Student(3, "张三", 25, "妖艳区");
        try {
            File file = new File("JavaFile_16/student.txt");
            ObjectOutputStream  outputStream=new ObjectOutputStream(new FileOutputStream(file,true));
            outputStream.writeObject(student1);

            outputStream.writeObject(student2);
         // outputStream.write("\n".getBytes(StandardCharsets.UTF_8));
            outputStream.writeObject(student3);
         //  outputStream.write("\n".getBytes(StandardCharsets.UTF_8));
            outputStream.flush();

            ObjectInputStream  objectInputStream=new ObjectInputStream(new FileInputStream(file));

            Object  o = objectInputStream.readObject();
            Student  student=(Student)o;
            System.out.println("------"+o);
            o = (Student)objectInputStream.readObject();
            System.out.println(o);

            objectInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}


class Student implements Serializable {
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
