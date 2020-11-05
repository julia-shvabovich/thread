package thread;

public class Counter {
    private static final int MAX_VALUE = 100;
    private int value;

    public int getValue() {
        return value;
    }

    public static int getMaxValue() {
        return MAX_VALUE;
    }

    public void count() {
        value++;
    }
}
