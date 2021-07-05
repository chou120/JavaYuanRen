package core11;

public class ProductThread implements Runnable{
    int  i=0;
    @Override
    public void run() {
        //生产蛋糕   比如果给个判断  是否要继续生产
        while(true) {

            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(!Tool.flag){  //作为判断标志
                synchronized (Tool.cake){
                 //   System.out.println(Thread.currentThread().getName()+"进来了...");
                    if(i%2==0){
                        Tool.cake.setType("水果");
                        Tool.cake.setWeight(13);
                    }else{
                        Tool.cake.setType("奶油");
                        Tool.cake.setWeight(23);
                    }
                    i++;
                    Tool.flag=true;
                   // System.out.println(Thread.currentThread().getName()+"在执行");
                    Tool.cake.notify();//唤醒获取蛋糕的线程

                    //wait  表示操作当前数据的线程
                    try {
                        Tool.cake.wait();  //让操作蛋糕的线程进入等待   释放资源
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

            //如果解决线程无限次执行的问题    在生产一此蛋糕之后就暂停


        }
    }
}
