package core8;

import java.util.HashMap;

public class MythreadHashMap {

    //用来测试hashMap是否线程安全
    public  static HashMap<String,String> map=new HashMap<>();

    public static void main(String[] args) {

        Thread thread=new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100000; i++) {
                    map.put(String.valueOf(i),String.valueOf(i));
                }
            }
        };
        Thread thread2=new Thread() {
            @Override
            public void run() {
                for (int i = 100000; i <200000; i++) {
                    map.put(String.valueOf(i),String.valueOf(i));
                }
            }
        };
        thread.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int l =0;l <100000;l++){
            //如果key和value不同，说明两个线程在put的过程出现异常
            if(!String.valueOf(l).equals(map.get(String.valueOf(l)))){
                System.out.println(String.valueOf(l)+": "+map.get(String.valueOf(l)));
            }
        }

    }

}
