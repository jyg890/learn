package thread;

/**
 * @author JYG
 * @description
 * @create 2021−01-05 5:19 下午
 */
public class ResourceNumber {
    private int num = 0;

//    public synchronized void increment() throws InterruptedException {
//
//        //如果num不等于0，则线程等待（1、判断）
//        if (num != 0){
//            this.wait();
//        }
//        //2、执行
//        num++;
//        System.out.println(Thread.currentThread().getName()+":"+num);
//        //唤醒所有等待的线程（3、通知）
//        this.notifyAll();
//    }
//
//    public synchronized void decrement() throws InterruptedException {
//
//        if (num != 1){
//            this.wait();
//        }
//        num--;
//        System.out.println(Thread.currentThread().getName()+":"+num);
//        this.notifyAll();
//    }

    public synchronized void increment() throws InterruptedException {

        //如果num不等于0，则线程等待（1、判断）
        while (num != 0){
            this.wait();
        }
        //2、执行
        num++;
        System.out.println(Thread.currentThread().getName()+":"+num);
        //唤醒所有等待的线程（3、通知）
        this.notifyAll();
    }

    public synchronized void decrement() throws InterruptedException {

        while (num != 1){
            this.wait();
        }
        num--;
        System.out.println(Thread.currentThread().getName()+":"+num);
        this.notifyAll();
    }
}
