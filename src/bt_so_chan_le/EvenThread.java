package bt_so_chan_le;

public class EvenThread implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i+= 2) {
                System.out.println("NumberEven " + i);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            System.out.println("Over");
        }
        System.out.println("End1");
    }
}
