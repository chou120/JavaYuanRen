package core11;

public class ConsumerThread implements Runnable {

    @Override
    public void run() {
        //是否要继续获取
        while (true) {
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (Tool.flag) {
                synchronized (Tool.cake) {
                   // System.out.println(Thread.currentThread().getName() + "进来了...");
                    System.out.println("蛋糕名称:" + Tool.cake.getType() + ",重量:" + Tool.cake.getWeight());
                    Tool.flag = false;
                    Tool.cake.notify();//唤醒生产蛋糕的线程
                    try {
                        Tool.cake.wait();  //获取之后也要进入等待状态
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            //如果解决线程无限次执行的问题   在获取一次蛋糕的时候执行 否则其他时候都是在等待生产者提供 蛋糕
        }
    }
}
