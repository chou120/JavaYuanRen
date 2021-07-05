package homework2;

public class MyThread extends Thread{

    int  number=0;
    char ch='A';
    boolean flag=false;
    @Override
    public void run() {
        //如果只有一个线程的情况下，分别执行输出  数字和字母
        while(ch<='Z'){
            if(!flag){
                System.out.print(++number);
                flag=true;
            }else{
                System.out.print(ch+"\t");
                flag=false;
                ch++;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class  Test{
    public static void main(String[] args) {
        new MyThread().start();
    }
}