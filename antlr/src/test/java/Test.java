import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by rensong.pu on 2016/10/14.
 */
public class Test {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();

        new Thread() {

        }.start();

        Integer target = null;
        try {
            target = queue.poll(1, TimeUnit.HOURS);//阻塞方法
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hehe");
    }

    class Record implements Runnable{

        public void run() {

        }
    }


}
