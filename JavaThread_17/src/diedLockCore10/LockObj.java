package diedLockCore10;

import java.util.concurrent.Semaphore;

public class LockObj {


    //创建两个锁对象
    public  static  final  Object  A=new Object();
    public  static  final  Object  B=new Object();

    public  static  final Semaphore   semaphore1=new Semaphore(1);  //每次都让它只允许通过一个线程
    public  static  final Semaphore   semaphore2=new Semaphore(1);  //每次都让它只允许通过一个线程

    //Count

}
