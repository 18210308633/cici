import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by rensong.pu on 2016/10/14.
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        String table = "vipdw . ww";

        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar=>" + calendar.getTime());
        Calendar t = Calendar.getInstance();
        t.setTimeInMillis(new SimpleDateFormat("yyyy-MM-dd").parse("2015-9-11").getTime());
        System.out.println("date=>"+t.get(Calendar.DATE));
        calendar.set(Calendar.DAY_OF_YEAR,t.get(Calendar.DAY_OF_YEAR));
        System.out.println("t=>" + t.getTime());
        System.out.println("calendar=>" + calendar.getTime());

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

    class Record implements Runnable {

        public void run() {

        }
    }


}
