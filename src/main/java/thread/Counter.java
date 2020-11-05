package thread;

public class Counter {
    private int value;
    private static final int MAX_VALUE = 50;

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
