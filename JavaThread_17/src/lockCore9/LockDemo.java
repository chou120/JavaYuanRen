package lockCore9;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

    /**
     * synchronized 和 lock的区别
     * <p>
     * Lock 锁  和 synchronized  对比
     * <p>
     * 1. synchronized内置java关键字在jvm层,lock是个java类 是 jdk层的
     * <p>
     * 2. synchronized无法判断是否获取锁的状态,lock可以判断是否获取锁
     * <p>
     * 3. synchronized会自动释放锁,lock必须手动释放锁(unlock()在finally释放) 否则会造成死锁
     * <p>
     * 4. 使用synchronized的两个线程A和B 如果线程A 获得了锁,那么B一定在等待中.如果线程A阻塞了,则线程B
     * <p>
     * 会一直等待下去,lock不一定会等待，如果尝试获取不到锁,线程不会等待,直接结束
     * <p>
     * 5.synchronized适合少量的代码同步,Lock比较适合大量的同步代码的问题
     */
    Lock lock = new ReentrantLock();

    public void testLock(Thread thread) {

        System.out.println(thread.getName());
        lock.lock();
        System.out.println(thread.getName() + "进来了" + thread.getState());
        try {
            thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        System.out.println(thread.getName() + "状态为:" + thread.getState());

    }


    public void lockNotWait(Thread thread) {

        boolean b = false;
        try {
            b = lock.tryLock(1000, TimeUnit.MILLISECONDS);
            if (b) {
                try {
                    System.out.println(thread.getName() + "获取到了锁");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();   //获取到锁要释放  如果不释放  下一个等待的线程就会直接结束
                    System.out.println(thread.getName() + "释放锁....");
                }
            } else {
                System.out.println(thread.getName() + "没有获取到锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class TestLockDemo {
    public static void main(String[] args) {
        LockDemo lockDemo = new LockDemo();
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                // lockDemo.testLock(Thread.currentThread());
                lockDemo.lockNotWait(Thread.currentThread());
            }
        }, "线程A");
        A.start();
       /* try {   //这是测试 testLock   如果要测试 lockNotWait此方法  就把join注释 不然会影响结果
            A.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                //lockDemo.testLock(Thread.currentThread());
                lockDemo.lockNotWait(Thread.currentThread());
            }
        }, "线程B");
        B.start();
        /*try {
            B.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.out.println("main---A" + A.getState());
        System.out.println("main---B" + B.getState());


    }
}

