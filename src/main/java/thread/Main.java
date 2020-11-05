package thread;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread = new ThreadExtendsThreadImpl(counter);
        Thread runnable = new Thread(new ThreadRunnableImpl(counter));
        thread.start();
        runnable.start();
    }
}
