package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author JYG
 * @description
 * @create 2021β04-09 10:50 δΈε
 */
public class threadFor {

    public final static Executor EXECUTOR = Executors.newCachedThreadPool();

    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            final int j = i;
            EXECUTOR.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(j);
                }
            });
        }
    }

}
