package threadPool;

import java.util.concurrent.*;

public class MyThread {

    public static void main(String[] args) {

      /*  ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(Thread.currentThread().getName()+"在执行..."+i);
                }
            }
        });
        executorService.shutdown(); //摧毁线程池
*/

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        long  start=System.currentTimeMillis();
       /* for (int i = 0; i < 100000; i++) {
          final   int num = i;
            executorService.submit(new Runnable() {//  表示线程池开启 每次开启都会去线程池里面调用一个线程
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"----"+num);
                }
            });
        }*/
           /* executorService.submit(new Runnable() {//  表示线程池开启 每次开启都会去线程池里面调用一个线程
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                        System.out.println(Thread.currentThread().getName() + "----" + i);
                    }
                }
            });*/

        long  end=System.currentTimeMillis();
        System.out.println("消耗时间为:"+(end-start));
        //测试线程池的时候 一定要考虑到 主线程可能会摧毁线程池
        //executorService.shutdownNow();

       //课堂小练习:使用线程池的方式,发送10万条数据,线程池中只有6个线程,但是要发送给十个人  1 999   1000 1999  2000 2999

        ExecutorService executorService2 = Executors.newFixedThreadPool(10);

        Future submit = executorService2.submit(new TreadDemo());
        try {

            System.out.println(  submit.get());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
class  TreadDemo  implements Callable{
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 100000; i++) {
            System.out.println(Thread.currentThread().getName() + "----" + i);
        }
        return "小伙子你已经成功了";
    }
}

