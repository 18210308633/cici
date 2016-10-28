package com.test;

/**
 * Created by rensong.pu on 2016/10/25.
 */
public class FalseSharing implements Runnable {
    private static final int NUM_THREADS = 4;// change
    private static final long ITERATIONS = 500 * 1000L * 1000L;
    private final int arrayIndex;

    public FalseSharing(final int arrayIndex) {this.arrayIndex = arrayIndex;}

    private static VolatileLong[] longs = new VolatileLong[NUM_THREADS];

    static {
        for (int i = 0; i < longs.length; i++) {
            longs[i] = new VolatileLong();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final long start = System.currentTimeMillis();
        runTest();
        System.out.println("runtime=>" + (System.currentTimeMillis() - start) + " ms");
    }

    private static void runTest() throws InterruptedException {
        Thread[] threads = new Thread[NUM_THREADS];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new FalseSharing(i));
        }
        for(Thread t:threads){
            t.start();
        }
        for(Thread t:threads){
            t.join();
        }
    }

    public void run() {
        long i = ITERATIONS + 1;
        while (0 != --i) {
            longs[arrayIndex].value = i;
        }
    }


    public static class VolatileLong {
        public volatile long value = 0L;
        public long p1, p2, p3, p4, p5, p6; // comment out,填充cache line，减少来自同一个cache line的资源竞争。
    }
}
