package book;

/**
 * @author JYG
 * @description  需要注意的是当使用notify()的时候 只会在该当前共享对象使用wait之后的阻塞队列中选择一个线程来占用cpu运行
 * @create 2021−04-19 3:10 下午
 */
public class NotifyStudy {

    private static volatile Object resourceA = new Object();
    public static void main(String[] args) throws InterruptedException {

      Thread threadA = new Thread(new Runnable() {
          @Override
          public void run() {
              synchronized (resourceA){
                  System.out.println("线程A获取资源A的锁");
                  try {
                      System.out.println("threadA begin wait~");
                      resourceA.wait();
                      System.out.println("threadA end wait~");

                  }catch (Exception e){
                      e.printStackTrace();
                  }
              }
          }
      });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA){
                    System.out.println("线程B获取资源A的锁");
                    try {
                        System.out.println("threadB begin wait~");
                        resourceA.wait();
                        System.out.println("threadB end wait~");

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA){
                    System.out.println("线程C获取资源A的锁");
                    try {
                        System.out.println("threadC begin notify resourceA");
                        resourceA.notifyAll();
                        //resourceA.notify();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });

        threadA.start();
        threadB.start();
        //Thread.sleep(1000);
        /**
         * 线程A获取资源A的锁
         * threadA begin wait~
         * 线程C获取资源A的锁
         * threadC begin notify resourceA
         * 线程B获取资源A的锁
         * threadB begin wait~
         * threadA end wait~
        **/
        threadC.start();

        threadA.join();
        threadB.join();
        threadC.join();

        System.out.println("main over");

    }
}
