package core3;

public class ThreadSleep implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
           /* try {
               // Thread.sleep((int)(Math.random()*1000));
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            System.out.println(Thread.currentThread().getName()+"在执行"+i);

           // Thread.yield();//线程礼让  这个方法可以在一定程度上让线程和谐运行，一人一次。但是并不能保证！

        }
    }
}
