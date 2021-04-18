package book;

/**
 * @author JYG
 * @description  线程调用共享对象的wait方法 当前线程只会释放当前共享对象的锁
 * @create 2021−04-18 1:23 下午
 */
public class ThreadA {
    public static volatile Object resourceA = new Object();

    public static volatile Object resourceB = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (resourceA){
                        System.out.println("线程A拿到resourceA锁");

                        synchronized (resourceB){
                            System.out.println("线程A拿到resourceB锁");

                            System.out.println("线程A释放resourceA锁");

                            resourceA.wait();

                        }
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    synchronized (resourceA){
                        System.out.println("线程B拿到resourceA锁");
                        System.out.println("线程B尝试获取resourceB锁");


                        synchronized (resourceB){
                            System.out.println("线程B拿到resourceB锁");

                            System.out.println("线程B释放resourceA锁");

                            resourceA.wait();

                        }
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();
        System.out.println("main over");

    }

}
