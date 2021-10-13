package bt_so_chan_le;

public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        Thread thread1 = new Thread(evenThread);
        thread1.start();
        Thread thread = new Thread(oddThread);
        thread.start();

    }
}
