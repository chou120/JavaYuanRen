package core7;

import java.util.Hashtable;

public class MyThread implements Runnable {
    int ticket = 30;
    Object  object=new Object();


    /**
     * 同步锁可以有 任意一个class文件  任意类型的对象(唯一)  还可以是实现runnable的当前对象 this
     *
     *
     * 同步的前提
         * 多个线程
         *      多个线程使用的是同一个锁对象
         * 同步的好处
         *      同步的出现解决了多线程的安全问题。
         * 同步的弊端
         *      当线程相当多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率。
     *
     *
     */


    @Override
    public void run() {
        while (true) { //使用runnable的方式 解决了数据资源不唯一  数据可能出现负数的情况
            // System.out.println(Thread.currentThread().getName() + "正在卖第" + (ticket--) + "张票");  可能会出现重复数据
        /*synchronized(MyThread.class){  //括号里面的锁是唯一的
           //同步代码块
        }*/
            show();

        }
    }


    public synchronized void  show(){   //如果是同步方法  这个锁是当前对象
        if (ticket > 0) {
            try {
                Thread.sleep((int) (Math.random() *2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + (ticket--) + "张票"); //还可能出现负数
        }
    }





}

class TestThread {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread A = new Thread(myThread, "窗口A");
        Thread B = new Thread(myThread, "窗口B");
        Thread C = new Thread(myThread, "窗口C");
        A.start();
        B.start();
        C.start();


    }
}
class User{}
