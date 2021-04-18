package sync;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author JYG
 * @description
 * @create 2021−03-10 3:41 下午
 */
public class Test4 {

    public static void main(String[] args) {
        FutureTask task = new FutureTask<Integer>((Callable<Integer>)() -> {

            int i=0;
            for(;i<100;i++) {
                System.out.println(Thread.currentThread().getName()+"的循环变量i"+i);
            }
            return i;
        });
        //以上是子线程

        for(int i=0;i<100;i++) {
            System.out.println(Thread.currentThread().getName()+"的循环变量i为"+i);
            if(i==20) {
                new Thread(task,"有返回值的线程").start();
            }
        }
        try {
            System.out.println("子线程的返回值"+task.get());
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}

