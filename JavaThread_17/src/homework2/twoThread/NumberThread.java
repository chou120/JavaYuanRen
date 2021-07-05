package homework2.twoThread;

public class NumberThread extends Thread{

    int  number=1;
    @Override
    public void run() {
        //输出数字
       while(Tool.ch<='Z'){
           System.out.print(number);
           number++;
           try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

       }
    }
}
