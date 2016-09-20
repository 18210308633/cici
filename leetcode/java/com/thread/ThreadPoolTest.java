package com.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by rensong.pu on 2016/9/19.
 */
public class ThreadPoolTest {
//    private static final ExecutorService pool = Executors.newFixedThreadPool(1);

    public static void main(String[] args) {
        int pid = getPid();
        System.out.println(pid);
        int i = 0;
        for (int j = 0; j < 100; j++) {
            new ThreadPoolTest().runPool();
        }
    }

    public void runPool() {
        ExecutorService pool = Executors.newCachedThreadPool();
        if (pool != null) {
            pool.submit(new Runnable() {
                            public void run() {
                                System.out.println(Thread.currentThread().getName());
                                try {
                                    System.out.println(1 / 0);
                                    Thread.sleep(1000);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                       );
//                pool.shutdown();
        }
//                pool = null;
    }

    public static int getPid() {
        RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
        String name = runtime.getName(); // format: "pid@hostname"
        try {
            return Integer.parseInt(name.substring(0, name.indexOf('@')));
        } catch (Exception e) {
            return -1;
        }
    }

}
