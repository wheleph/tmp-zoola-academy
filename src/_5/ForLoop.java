package _5;

public class ForLoop {
    private static int hiddenCounter = 0;

    public static void main(String[] args) {
        for (init(); condition(); increment()) {
            System.out.println("Working...");
        }
    }

    private static void init() {
        System.out.println("Initializing");
    }

    private static void increment() {
        System.out.println("Incrementing");
    }

    private static boolean condition() {
        System.out.println("Checking condition");
        return hiddenCounter++ < 5;
    }
}
