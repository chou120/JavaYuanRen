package core11;

public class MyThread {

    /**
     *  生产 蛋糕    生产者生产1个蛋糕     消费者才回去消费一个蛋糕
     *
     *
     *
     */
    public static void main(String[] args) {

        ProductThread productThread = new ProductThread();
        ConsumerThread consumerThread=new ConsumerThread();
        Thread pro = new Thread(productThread, "生产者");
        pro.start();
        /*try {
            pro.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Thread thread = new Thread(consumerThread,"消费者");
        thread.start();

    }
}
