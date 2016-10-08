package com.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by rensong.pu on 2016/9/19.
 */
public class ThreadPoolTest {
//    private static final ExecutorService pool = Executors.newFixedThreadPool(1);

    public static void main(String[] args) {
        int pid = getPid();
        System.out.println(pid);
        int i = 0;
        List<Callable<String>> tasks = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            Callable<String> callable = new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return "helloWorld";
                }
            };
            tasks.add(callable);
//            new ThreadPoolTest().runPool();
        }
        List<Future<String>> list = invokeAll(tasks);
        for (Future<String> status : list) {
            System.out.println("cancel:" + status.isCancelled() + " isdone:" + status.isDone());
        }

    }

    public static List<Future<String>> invokeAll(List<Callable<String>> tasks) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        try {
            return executorService.invokeAll(tasks, 1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if(executorService!=null){
                executorService.shutdown();
            }
        }
        return null;
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
