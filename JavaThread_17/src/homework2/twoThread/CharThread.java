package homework2.twoThread;

public class CharThread extends Thread{


    @Override
    public void run() {
        //输出字符
        while(Tool.ch<='Z'){
            System.out.print(Tool.ch+++"\t");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
