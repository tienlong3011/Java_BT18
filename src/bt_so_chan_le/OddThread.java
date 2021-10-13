package bt_so_chan_le;

public class OddThread implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 1; i < 10; i = i + 2) {
                System.out.println("NumberOdd " + i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Over");
        }
        System.out.println("End");
    }
}
