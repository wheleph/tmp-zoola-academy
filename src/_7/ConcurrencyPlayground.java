package _7;

public class ConcurrencyPlayground {

    private static final int NUM_OP = 1_000_000;

    public static void main(String[] args) throws InterruptedException {
        final Calculator c = new Calculator(1);

        Thread tAdd = new Thread(() -> {
            for (int i = 0; i < NUM_OP; i++) {
                c.add(10);
            }
        });
        Thread tSub = new Thread(() -> {
            for (int i = 0; i < NUM_OP / 2; i++) {
                c.subtr(10);
            }
        });

        tAdd.start();
        tSub.start();
        tAdd.join();
        tSub.join();

        System.out.printf("Done foreground. Val = %d", c.getValue());
    }
}
