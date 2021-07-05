package diedLockCore10;

public class TestMyDiedThread {


    public static void main(String[] args) {

        MyThread myThreadA = new MyThread();
        MyThreadOther myThreadB = new MyThreadOther();

        myThreadA.setPriority(10);
        myThreadA.start();
        myThreadB.start();

    }

}
