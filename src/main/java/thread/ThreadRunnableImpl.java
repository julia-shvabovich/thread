package thread;

import org.apache.log4j.Logger;

public class ThreadRunnableImpl implements Runnable {
    private static final Logger logger = Logger.getLogger(ThreadRunnableImpl.class);
    private Counter counter;

    public ThreadRunnableImpl(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getValue() < counter.getMaxValue()) {
            counter.count();
            logger.info(Thread.currentThread().getName() + " " + counter.getValue());
        }
    }
}
