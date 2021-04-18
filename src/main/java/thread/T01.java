package thread;

import java.util.concurrent.TimeUnit;

/**
 * @author JYG
 * @description
 * @create 2021−01-06 10:51 上午
 */
public class T01 {
    private static class T1 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i ++){
                try {
                    TimeUnit.MICROSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T1");
            }
        }
    }

    public static void main(String[] args) {
        new T1().start();

        for (int i = 0; i < 10; i++){
            try {
                TimeUnit.MICROSECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("main");
        }
    }
}
