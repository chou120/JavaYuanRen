package diedLockCore10;

import java.util.concurrent.TimeUnit;

public class MyThreadOther extends Thread {

    /**
     *      一个苹果   一个梨子   你手里抢到了苹果   你哥哥手里抢到了梨子   两个都要
     *
     *  死锁:是指两个或者两个以上的线程在执行的过程中，因争夺资源产生的一种互相等待现象
     *
     *      CountDownLatch
     *
     */
    @Override
    public void run() {

        //自己尝试去使用lock锁的方式  改下面代码  让下面代码不会产生死锁问题
        /*synchronized (LockObj.B){
            System.out.println(Thread.currentThread().getName()+"进来了...B");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (LockObj.A){
                System.out.println(Thread.currentThread().getName()+"进来了...A");
            }
        }*/

        try {
            if(LockObj.semaphore2.tryAcquire(1,2000, TimeUnit.MILLISECONDS)){
                System.out.println(Thread.currentThread().getName()+"进来了获取到了锁");
                if(LockObj.semaphore1.tryAcquire(1,2000, TimeUnit.MILLISECONDS)){
                    System.out.println(Thread.currentThread().getName()+"进来了,获取到了锁");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            LockObj.semaphore2.release();
            LockObj.semaphore1.release();
        }




    }
}
