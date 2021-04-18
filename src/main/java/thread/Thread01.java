package thread;

/**
 * @author JYG
 * @description
 * @create 2021−01-05 4:38 下午
 */
public class Thread01 {

    public static void main(String[] args) {
        Ticket01 ticket = new Ticket01();

//        new Thread(()->{
//            for(int i = 0;i < 20; i++){
//                ticket.sendTicket();
//            }
//        },"A").start();
//
//        new Thread(()->{
//            for(int i = 0;i < 20; i++){
//                ticket.sendTicket();
//            }
//        },"B").start();
//
//        new Thread(()->{
//            for(int i = 0;i < 20; i++){
//                ticket.sendTicket();
//            }
//        },"C").start();

//        ResourceNumber resourceNumber = new ResourceNumber();
//        new Thread(()->{
//            for (int i = 0; i < 10; i++){
//                try {
//                    resourceNumber.increment();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        },"A").start();
//
//        new Thread(()->{
//            for (int i = 0; i < 10; i++){
//                try {
//                    resourceNumber.decrement();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        },"B").start();
//
//        new Thread(()->{
//            for (int i = 0; i < 10; i++){
//                try {
//                    resourceNumber.increment();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        },"C").start();
//
//        new Thread(()->{
//            for (int i = 0; i < 10; i++){
//                try {
//                    resourceNumber.decrement();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        },"D").start();

        ResourceNumber2 resourceNumber = new ResourceNumber2();
        new Thread(()->{
            for (int i = 0; i < 10; i++){
                try {
                    resourceNumber.incrementA();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++){
                try {
                    resourceNumber.decrementB();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++){
                try {
                    resourceNumber.incrementC();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"C").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++){
                try {
                    resourceNumber.decrementD();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"D").start();
    }
}
