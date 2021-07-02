package core3;

public class TestSleep {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        Thread A = new Thread(threadSleep, "线程A");
        Thread B = new Thread(threadSleep, "线程B");
        Thread C = new Thread(threadSleep, "线程C");
        /*A.setPriority(10);
        B.setPriority(7);*/

        //A.start();
       // A.setDaemon(true);
       /* try {
            A.join();   //当前执行的线程后面的所有线程全部等待  知道当前线程执行完毕
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
     //   B.start();
      /*  try {
            B.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

       // C.start();
        /*try {
            C.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Thread.currentThread().setDaemon(true);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("-------------------->"+Thread.currentThread().getState());


    }
}
