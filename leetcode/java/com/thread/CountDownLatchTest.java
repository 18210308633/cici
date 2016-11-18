//package com.thread;
//
//imp java.util.ArrayList;
//imp java.util.List;
//imp java.util.concurrent.CountDownLatch;
//imp java.util.concurrent.Executor;
//imp java.util.concurrent.ExecutorService;
//imp java.util.concurrent.Executors;
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
