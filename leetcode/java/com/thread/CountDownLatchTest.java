//package com.thread;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.Executor;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
///**
// * Created by rensong.pu on 2016/8/16.
// */
//public class CountDownLatchTest {
//    static class Task implements Runnable {
//        private int id;
//
//        @Override
//        public void run() {
//            System.out.println("name->" + id);
//        }
//
//        public Task(int id) {
//            this.id = id;
//        }
//    }
//
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        final CountDownLatch count = new CountDownLatch(list.size());
//        final ExecutorService executorService = Executors.newFixedThreadPool(5);
//        list.forEach(e -> {
//                         try {
//                             executorService.submit(new Task(e));
//                         } catch (Exception e1) {
//                             e1.printStackTrace();
//                         } finally {
//                             count.countDown();
//                         }
//                     }
//                    );
//        try {
//            count.await();
//            System.out.println("ggg");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        executorService.shutdown();
//        System.out.println("sasdasds");
//    }
//}
