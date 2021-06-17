package com.yaunren.Extend;

//子类  派生类
public class Student  extends  Person{

    private String  address="";

    public Student() {
        super();
        System.out.println("这是Student的构造函数");
    }

    //如果测试类通过此有参构造器创建子类对象  那么请问 父类和子类构造器执行的顺序
    public Student(String name, Character sex, Integer age, String address) {
       //super(name, sex, age);
        this.address = address;
        System.out.println("这是子类的有参构造函数");
    }


    public Student(String name, Character sex, Integer age) {
         // super(参数列列表);如果不存在 那么就会去访问父类的无参构造 不再去访问父类的有参构造
        this(); //表示访问当前对象的无参构造函数
        //如果不去访问父类的有参构造

        /**
         * super() 和 this()在构造函数里面只能是第一行的位置
         * super   表示父类对象在内存中所存在的位置
         * this   ......
         *
         */

        System.out.println("这是子类的有参构造");
    }

    /**
     * 公有化的成员隐藏在子类中
     *
     * 创建子类对象的时候优先去访问父类的构造函数 原因是因为子类要用到父类的成员
     *
     *  构造函数不是继承的 而是通过super()去访问的
     */


    public void  showInfo(){
        
        //不能继承父类私有化成员
        
        
        //去访问父类的私有化成员
       /* Person person = new Person();
        System.out.println(person.name);*/

       /* Person person = new Person();
        person.method();*/

        System.out.println("名字叫:"+getName());



    }


}
