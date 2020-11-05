package thread;

import org.apache.log4j.Logger;

public class ThreadExtendsThreadImpl extends Thread {
    private static final Logger logger = Logger.getLogger(ThreadExtendsThreadImpl.class);
    private Counter counter;

    public ThreadExtendsThreadImpl(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while(counter.getValue() < Counter.getMaxValue()) {
            counter.count();
            logger.info(Thread.currentThread().getName() + " " + counter.getValue());
        }
    }
}
