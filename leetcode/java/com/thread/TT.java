package com.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by rensong.pu on 2016/8/16.
 */
public class TT {
    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        // 开始的倒数锁
//        final CountDownLatch begin = new CountDownLatch(1);
        // 结束的倒数锁
        final CountDownLatch end = new CountDownLatch(86);
        // 十名选手
        final ExecutorService exec = Executors.newFixedThreadPool(10);
        for (int index = 0; index < 86; index++) {
            final int NO = index + 1;
            Runnable run = new Runnable() {
                public void run() {
                    try {
//                        begin.await();
                        System.out.println(NO);
//                        Thread.sleep((long) (Math.random() *  10));
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        end.countDown();
                    }
                }
            };
            exec.submit(run);
        }
//        System.out.println("Game Start");
//        begin.countDown();
        end.await();
        System.out.println("Game Over");
        exec.shutdown();
        System.out.print("共计用时 ");
        System.out.println(System.currentTimeMillis()  - start);
    }

}
