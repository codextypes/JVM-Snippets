package xyz.joshaustin.snippets;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class CountingPuppies {

    private int puppyCount = 0;
    private ExecutorService executorService;

    public CountingPuppies() {
        this.executorService = Executors.newCachedThreadPool();
    }

    private synchronized void addPuppy() {
        System.out.print((++puppyCount) + " ");
    }

    public void addPuppies(int puppies) {
        try {
            for (int i = 0; i < puppies; i++) {
                executorService.submit(this::addPuppy);
            }
        }
        finally {
            executorService.shutdown();
        }
    }

}
