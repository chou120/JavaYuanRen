package com.yuanren.staticCore;

public class StaticDemo {

/**
 * static方法就是没有this的方法。在static方法内部不能调用非静态方法，反过来是可以的。而且可以在没有创建任何对象的前提下，
 * 仅仅通过类本身来调用static方法。这实际上正是static方法的主要用途。”
            这段话虽然只是说明了static方法的特殊之处，但是可以看出static关键字的基本作用，简而言之，一句话来描述就是：
            方便在没有创建对象的情况下来进行调用（方法/变量）。
            很显然，被static关键字修饰的方法或者变量不需要依赖于对象来进行访问，只要类被加载了，就可以通过类名去进行访问。
            static可以用来修饰类的成员方法、类的成员变量，另外可以编写static代码块来优化程序性能。
            没有被static 修饰的是对象成员
            被static 修饰的是类成员

*/
    private   static  int  age=21;   //被 static修饰的属性或者是方法 不在属于任何一个对象  而是属于类(class)
    public  String  name="haha";

    public static void show(){
       // System.out.println(age+"---"+name);   //静态的只能访问静态的

    }
    public void  method(){   //非静态方法可以访问静态成员和非静态成员
        System.out.println(age+name);
        show();
    }


    public  String  getName(){
        return  name;
    }
    public void  setName(String  name){
        this.name=name;
    }

    public static  void setAge(int   age){
        StaticDemo.age=age; //static方法就是没有this的方法。
    }


    public  static int   getAge(){
        return age;
    }

}
class  TestStatic{

    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();
        System.out.println(sd.name);
        sd.setName("张三丰");
        sd.setAge(25);

        System.out.println("对象名调用静态方法:"+sd.getAge());
        /**
         * 类名.属性名
         * 类名.静态方法名
         */
        //System.out.println(StaticDemo.age);
        System.out.println("类名调用静态方法:"+StaticDemo.getAge());

       StaticDemo.setAge(34);

        System.out.println("类名调用静态方法:"+StaticDemo.getAge());


        System.out.println("对象名调用静态方法:"+sd.getAge());



    }

}