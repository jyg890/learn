package book;

/**
 * @author JYG
 * @description
 * @create 2021−04-18 1:55 下午
 */
public class WaitNotifyInterupt {

    static Object o =  new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("begin");
                    synchronized (o){
                        o.wait();
                    }

                    System.out.println("end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
        Thread.sleep(1000);

        System.out.println("begin Interrupted thread");
        thread.interrupt();
        System.out.println(" Interrupted thread  end");

    }
}
