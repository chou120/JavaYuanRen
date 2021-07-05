package homework2.twoThread;

public class TestThrad {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        CharThread charThread = new CharThread();
        numberThread.setPriority(10);
        charThread.setPriority(1);
        numberThread.start();
        charThread.start();

    }
}
