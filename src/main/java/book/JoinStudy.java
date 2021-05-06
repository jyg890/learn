package book;

/**
 * @author JYG
 * @description
 * @create 2021−04-20 4:47 下午
 */
public class JoinStudy {

    public static void main(String[] args) throws InterruptedException{
//        Thread threadA = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(10000);
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//                System.out.println("threadA over~");
//            }
//        });
//
//        Thread threadB = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(10000);
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//                System.out.println("threadB over~");
//            }
//        });
//
//        threadA.start();
//        threadB.start();
//
//        System.out.println("wait all thread over~");
//
//        threadA.join();
//        threadB.join();
//
//        System.out.println("all thread over~");

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("threadOne begin run ~");
                for (;;){

                }
            }
        });
        final Thread mainThread = Thread.currentThread();

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mainThread.interrupt();
            }
        });

        threadOne.start();
        threadTwo.start();

        try {
            threadOne.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
