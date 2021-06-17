package com.yaunren.Extend;

//父类  基类  超类
public class Person extends Object{
    private String name="大保健";
    private Character sex; //    asdasdas
    private Integer age;  //

    public Person() {
        System.out.println("这是person的无参构造函数");
    }

    public Person(String name, Character sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        System.out.println("person有参构造函数");
    }











    public void show(){
        System.out.println(this.name);
    }

    private  void method(){
        System.out.println("哈哈哈是");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
