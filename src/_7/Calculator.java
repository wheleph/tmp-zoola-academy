package _7;

public class Calculator {
    private int value;

    public Calculator(int value) {
        this.value = value;
    }

    public synchronized void add(int op) {
        value += op;
    }

    public synchronized void subtr(int op) {
        value -= op;
    }

    public synchronized int getValue() {
        return value;
    }
}
