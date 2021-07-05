package diedLockCore10;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {

    /**
     *      一个苹果   一个梨子   你手里抢到了苹果   你哥哥手里抢到了梨子   两个都要
     *
     *  死锁:是指两个或者两个以上的线程在执行的过程中，因争夺资源产生的一种互相等待现象
     *
     */
    @Override
    public void run() {

        //自己尝试去使用lock锁的方式  改下面代码  让下面代码不会产生死锁问题
        /*    synchronized (LockObj.A){
                System.out.println(Thread.currentThread().getName()+"进来了...A");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (LockObj.B){
                    System.out.println(Thread.currentThread().getName()+"进来了...B");
                }
            }
*/

        try {
            if(LockObj.semaphore1.tryAcquire(1,2000, TimeUnit.MILLISECONDS)){
                System.out.println(Thread.currentThread().getName()+"进来了");

                if(LockObj.semaphore2.tryAcquire(1,2000, TimeUnit.MILLISECONDS)){
                    System.out.println(Thread.currentThread().getName()+"进来了");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            LockObj.semaphore1.release();
            LockObj.semaphore2.release();
        }

    }
}
