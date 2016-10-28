import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * Created by rensong.pu on 2016/10/24.
 */
public class TestVolite {
    public static volatile int count = 0;

    private static void inc() {

        //这里延迟1毫秒，使得结果明显
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }

        count++;
    }

    public static void main(String[] args) {
//        run1();
        try {
            run2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void run1() {
        List<Thread> list = new ArrayList();
        //同时启动1000个线程，去进行i++计算，看看实际结果
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(new Thread(new Runnable() {
                         @Override
                         public void run() {
                             TestVolite.inc();
                         }
                     }
                     )
                    );
            list.get(i).start();
            try {
                list.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //这里每次运行的值都有可能不同,可能为1000
        System.out.println("run1 运行结果:Counter.count=" + TestVolite.count + "\n耗时:" + (System.currentTimeMillis() - beginTime) + " ms");
    }


    public static void run2() throws InterruptedException {
        //同时启动1000个线程，去进行i++计算，看看实际结果
        long beginTime = System.currentTimeMillis();
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(10, new ThreadFactory() {
                                                               @Override
                                                               public Thread newThread(Runnable r) {
                                                                   return new Thread(r, "【testThread】");
                                                               }
                                                           }
                                                          );
            for (int i = 0; i < 10000; i++) {
                executorService.submit(new Thread(new Runnable() {
                                           @Override
                                           public void run() {
                                               TestVolite.inc();
                                           }
                                       }
                                       )
                                      );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != executorService) {
                    executorService.shutdown();
                    executorService.awaitTermination(1, TimeUnit.HOURS);//等待所有thread 执行完毕
                } else {
                    executorService.shutdownNow();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        Thread.sleep(5000);
        //这里每次运行的值都有可能不同,可能为1000
        System.out.println("run2 运行结果:Counter.count=" + TestVolite.count + "\n耗时:" + (System.currentTimeMillis() - beginTime) + " ms");
    }

}
