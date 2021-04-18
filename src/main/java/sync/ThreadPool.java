package sync;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author JYG
 * @description
 * @create 2021−03-10 4:25 下午
 */
public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(6);

        Runnable target = () -> {
            for (int i = 0;i < 10 ;i++){
                System.out.println(Thread.currentThread().getName() + "的i的值" + i);

            }
        };

        executorService.submit(target);

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        executorService.shutdown();
    }
}
