package bt_tao_thread;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        try {
            while (numberGenerator.getThread().isAlive()) {
                System.out.println("Hello");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println("Over");
    }
}
