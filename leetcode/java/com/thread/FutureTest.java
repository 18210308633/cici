//package com.thread;
//
//imp java.util.ArrayList;
//imp java.util.List;
//imp java.util.Random;
//imp java.util.concurrent.Callable;
//imp java.util.concurrent.ExecutionException;
//imp java.util.concurrent.ExecutorService;
//imp java.util.concurrent.Executors;
//imp java.util.concurrent.Future;
//imp java.util.concurrent.TimeUnit;
//imp java.util.concurrent.TimeoutException;
//
///**
// * JAVA1.5后提供了更为方便的线程神器Callable,Future
// * Callable和Future的学习
// * Created by rensong.pu on 2016/8/8.
// */
//public class FutureTest {
//    public static void main(String[] args) throws Exception {
//        /**
//         * callable的call类似runnable的run
//         * 不同的是callable有返回值(这样的好处是不用在线程中通过共享变量获取运行结果)
//         * call方法可以返回异常而run不可以
//         */
//        //PS：java8中实现了对Lambda的支持，对于只包含一个方法的接口(功能接口或函数式接口),可以使用lambda表达式替代匿名类的写法
//
//        Callable<Integer> callableTest = () -> 42;
//        Callable<Integer> callableTest2 = true ? () -> 42 : () -> 32;
//        System.out.println(callableTest2.call());
//
//        Callable<Integer> callable =
//                () -> {
//                    return new Random().nextInt(10);
//                };
//        /**
//         * Future表示异步计算的结果，提供了检查计算是否完成的方法
//         *以等待计算完成， 并检验计算的结果，cancel方法可以取消任务的执行k
//         */
//        FutureTask task = new FutureTask(callable); //自定义FutureTask类，api中有
//        new Thread(task).start();
//        try {
//
//            Thread.sleep(1000);//可以做其他事情
//            System.out.println(task.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("thread pool");
//
//        /**
//         * 使用Callable的好搭档 ExecutorService
//         * 利用线程池
//         */
//        ExecutorService threadPool = Executors.newSingleThreadExecutor();
//        Future<Integer> future = threadPool.submit(
//                () -> {
//                    return new Random().nextInt(100);
//                }
//                                                  );
//        try {
//            Thread.sleep(500);
//            System.out.println(future.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("多个任务返回值");
//        /**
//         * 运行多个任务带有返回值
//         */
//        List<Future> tasklist = new ArrayList<>();//存放查询线程
//        for (int i = 0; i < 3; i++) {
//            Future<Integer> future1 = threadPool.submit(new Callable<Integer>() {
//                                                            @Override
//                                                            public Integer call() throws Exception {
//                                                                return new Random().nextInt(100);
//                                                            }
//                                                        }
//                                                       );
//
//            tasklist.add(future1);
//        }
//        for (Future f : tasklist) {
//            System.out.println(f.get());
//        }
//
//
//    }
//
//    static class FutureTask implements Runnable, Future<Integer> {
//
//        private Callable<Integer> callable;
//
//        private Integer target;
//
//        public FutureTask(Callable<Integer> callable) {
//            this.callable = callable;
//        }
//
//        /**
//         * 取消任务
//         *
//         * @param mayInterruptIfRunning 设置为true则运行中但未完成的也会被取消执行
//         * @return
//         */
//        @Override
//        public boolean cancel(boolean mayInterruptIfRunning) {
//            return false;
//        }
//
//        @Override
//        public boolean isCancelled() {
//            return false;
//        }
//
//        @Override
//        public boolean isDone() {
//            return true;
//        }
//
//        /**
//         * 获取执行结果，此方法有阻塞，等任务执行完才返回
//         *
//         * @return
//         * @throws InterruptedException
//         * @throws ExecutionException
//         */
//        @Override
//        public Integer get() throws InterruptedException, ExecutionException {
//            return this.target;
//        }
//
//        /**
//         * 指定时间还没获取到结果，则返回null
//         *
//         * @param timeout 过期时间
//         * @param unit
//         * @return
//         * @throws InterruptedException
//         * @throws ExecutionException
//         * @throws TimeoutException
//         */
//        @Override
//        public Integer get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
//            return target;
//        }
//
//        @Override
//        public void run() {
//            try {
//                this.target = callable.call();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
