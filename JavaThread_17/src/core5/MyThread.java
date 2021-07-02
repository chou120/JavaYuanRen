package core5;


/**
 *
 * * NEW: 尚未启动的线程处于此状态.
 * * RUNNABLE: 在Java虚拟机中执行的线程处于此状态。
 * * BLOCKED: 处于等待监视器锁定状态的被阻塞线程处于此状态。
 * * WAITING: 无限期等待另一个线程执行特定操作的线程处于此状态。
 * * TIMED_WAITING: 个正在等待另一个线程执行操作的线程最多达到指定的等待时间，该线程处于此状态。
 * * TERMINATED: 退出的线程处于此状态。
 *
 */
public class MyThread  implements  Runnable{

    @Override
    public void run() {
        try {
            System.out.println("线程启动：----2" + Thread.currentThread().getState());  //获取当前线程状态
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class TestMyThread{
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        Thread  thread=new  Thread(myThread,"线程A");
        System.out.println("线程对象创建，还未调用start：---1" + thread.getState());
        thread.start();
   /* try {
      Thread.sleep(100);  //当前线程休眠
      System.out.println("---- 3" + thread.getState());  //自定义线程结束
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
*/

        try {
            thread.join();    //让别的线程等待
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前main线程的状态:--- "+Thread.currentThread().getState());
        System.out.println("线程结束：" + thread.getState());  //
     //   System.out.println("主线程结束之后:"+thread.getName()+"状态为:"+thread.getState());
    }
}