package com.yuanren.core;

public class Person {

    /**
     *   多态:
     *       当不同数据类型的对象具有同样的行为，虽然行为的表现方式有差异，但是可以把这些对象当做同一类对象进行处理。
     *
     *        多态是针对相同的行为，和数据类型无关。这样可以编写出更通用的方法，方法可以针对一类特定的行为，
     *        而不是针对单单一种数据类型。这样可以简化代码，并且增加了代码的扩展性，减少类和类之间的关联。
     *
     *   多态的实现:
     *          1.要有继承
     *          2.发生方法重写
     *          3.父类引用只想子类对象
     *
     */


    private String  name;
    private Integer  age;

    public  String  address="父亲在中国";

    public  void  makeMoney(String  jobType){
        System.out.println("父类通过"+jobType+"赚钱");
    }



    public  static  void  marry(){
        System.out.println("父类结婚");
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }






}
