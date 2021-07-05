package homework;

import java.util.Scanner;

public class CharOutput {

    // 开启一个线程，接收键盘的输入，将输入的值，逐个字符依次输出到屏幕上，输出每个字符的时间间隔是500ms
    public static void main(String[] args) {
         new MyThread().start();
    }
}
class MyThread   extends Thread{
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String   str=scanner.next();
        int  i=0;
        while(i< str.length()){
            char c = str.charAt(i);
            System.out.print(c+"\t");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}