package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by rensong.pu on 2016/12/28.
 */
public class TestJ8 {
    public static void main(String[] args) {
        String str = "not final";
        List<Callable<String>> list = Arrays.asList((Callable) () -> "heihei", (Callable) () -> str);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        try {
            List<Future<String>> futures = executorService.invokeAll(list, 1000, TimeUnit.MINUTES);
            for(Future future:futures){
                System.out.println(future.get().toString());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
