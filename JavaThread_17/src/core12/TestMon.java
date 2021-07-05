package core12;

import java.util.LinkedList;
import java.util.Queue;

public class TestMon {

    public static void main(String[] args) {

        Queue<Mon> queue = new LinkedList<>();

        ProductMon productMon = new ProductMon(queue);
        productMon.setName("生产者");
        ConsumerMon  consumerMon=new ConsumerMon(queue);
        consumerMon.setName("消费者");
        productMon.start();
        consumerMon.start();


    }
}
