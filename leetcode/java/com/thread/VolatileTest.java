package com.thread;

/**
 * Created by rensong.pu on 2016/9/23.
 */
public class VolatileTest {
    private int x = 0;
    private boolean v = false;

    public void read() {
        if (v) {
            System.out.println("x=>" + x);
        }
    }

    public void write() {
        x = 1;
        v = true;//指令重排序的时候，v已经是true的情况，thread2读到了x，此时x还未赋值1
    }

    public static void main(String[] args) {
        final VolatileTest va = new VolatileTest();
        while(va.x==0){
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    va.write();
                }
            }
            );

            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    va.read(); //线程2在读到这个的时候，可能是还未赋值的x
                }
            }, "thread2"
            );
            thread1.start();
            thread2.start();
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("all is done");
        }
    }
}
