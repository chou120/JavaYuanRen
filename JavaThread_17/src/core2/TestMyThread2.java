package core2;

import com.yuanren.core.MyThread;

public class TestMyThread2 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();  //保证线程任务的唯一性
        Thread thread = new Thread(myThread,"线程A");
        thread.setPriority(1);
        thread.start();
        Thread threadB = new Thread(myThread,"线程B");
        threadB.setPriority(10);
        threadB.start();

        Thread threadC = new Thread(myThread,"线程VC");
        threadC.setPriority(7);
        threadC.start();


        System.out.println(Thread.currentThread().getName());

    }
}
