package core12;

import java.util.Queue;

public class ConsumerMon extends Thread {


    private final Queue<Mon> queue;

    public ConsumerMon(Queue<Mon> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            synchronized (queue) {
                if (!ProductMon.flag) {
                    if (queue.size() != 0) {
                        Mon poll = queue.poll();
                        System.out.println(poll.toString());
                    }else{
                        System.out.println("队列里面的数据已经消耗完毕,告诉生产者去生产");
                        try {
                            ProductMon.flag=true;
                            queue.notify();
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }
    }
}
