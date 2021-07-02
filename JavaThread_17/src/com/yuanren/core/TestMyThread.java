package com.yuanren.core;

public class TestMyThread {


    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        //myThread.setName("线程A");
        //myThread.run(); //只是普通调用
        myThread.start();

        //System.out.println(Thread.currentThread().getName());
        MyThread myThreadB = new MyThread();
        //myThreadB.setName("线程B");
        myThreadB.start();
        //同一个线程是否可以多次启动？   不可以  会报错  下面的错误
        //myThread.start();  //java.lang.IllegalThreadStateException

    }
}
