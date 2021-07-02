package core6;

public class MyThread  extends Thread{
    /**
     * 某电影院目前正在上映贺岁大片，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
     * 两种方式实现
     * 继承Thread类
     * 实现Runnable接口
     */
   static int  ticket=100;
    @Override
    public void run() {
        for (int i = ticket;i >0; i--) {
            System.out.println(Thread.currentThread().getName()+"正在卖第"+(ticket--)+"张票");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class  TestThread{

    public static void main(String[] args) {
        MyThread myThreadA = new MyThread();
        myThreadA.setName("窗口A");
        MyThread myThreadB = new MyThread();
        myThreadB.setName("窗口B");
        MyThread myThreadC = new MyThread();
        myThreadC.setName("窗口C");

        myThreadA.start();
        myThreadB.start();
        myThreadC.start();


    }
}
