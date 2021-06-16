package com.yuanren.obj;

public class TestObj {

    public static void main(String[] args) {

        Object o = new Object();
        Object o1 = new Object();

        System.out.println(o.hashCode()+"\t"+Integer.toHexString(o1.hashCode()));

        System.out.println(o.getClass());

        System.out.println(o.getClass().getName());

        System.out.println(o.equals(o1));

        System.out.println(o1.toString());

    }
}
