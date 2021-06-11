package com.yuanren.core2;

public class Person {

    private double height = 3.5;
    private String name = "小三";
    private int age = 5;  //全局变量
    //当全部变了和局部变量重名时,优先使用哪一个  优先使用局部变量
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String  address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;  //获取全局变量的值的时候 this 可以省略
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
