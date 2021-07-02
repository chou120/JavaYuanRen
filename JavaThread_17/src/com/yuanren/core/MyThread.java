package com.yuanren.core;

public class MyThread extends Thread{

    /**
     *     多线程: 并发(同时发生)
     *      进程:正在进行的程序   系统自动分配资源
     */
    @Override
    public void run() {    //线程任务代码
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"在执行"+i);
        }
    }
}
