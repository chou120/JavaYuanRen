package core12;

import java.util.Queue;

public class ProductMon extends Thread {
    private static int i = 0;
    private final Queue<Mon> queue;
    public static boolean flag = true;
    public ProductMon(Queue<Mon> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
                synchronized (queue) {
                    if (ProductMon.flag) {
                        if (queue.size() != 20) {
                            queue.add(new Mon(i, i + "号月饼"));
                            i++;
                        }else{
                            ProductMon.flag = false;
                            System.out.println(Thread.currentThread().getName()+"进来...wait");
                            queue.notify();
                            queue.wait();
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
