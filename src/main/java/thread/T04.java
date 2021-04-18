package thread;

/**
 * @author JYG
 * @description
 * @create 2021−01-06 10:41 上午
 */
public class T04 {

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(this.getState());

            for(int i=0; i<10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new MyThread();

        System.out.println(t.getState());

        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t.getState());

    }

    //NEW
    //RUNNABLE
    //0
    //1
    //2
    //3
    //4
    //5
    //6
    //7
    //8
    //9
    //TERMINATED
}
