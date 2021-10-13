package bt_tao_thread;

public class NumberGenerator implements Runnable{
    private Thread thread;

    public NumberGenerator() {
        thread= new Thread(this, "Run");
        System.out.println("My run" + thread);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Number" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Over");
    }
}
