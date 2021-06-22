package com.yuanren.homework;

public class Test {
    void myMethod()
    {
        System.out.println("Test");
    }
}
class Derived extends Test {
    void myMethod() {
        System.out.println("Derived");
    }

    public static void main(String[] args)
    {
        //  Test  test=new D();
        Derived object = (Derived)new Test();
        object.myMethod();
    }
}