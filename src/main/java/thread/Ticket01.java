package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author JYG
 * @description
 * @create 2021−01-05 5:05 下午
 */
public class Ticket01 {
    private int ticketCount = 30;

    //ReentrantLock（）默认是一个非公平锁，new ReentrantLock(ture)可实现公平锁
    private Lock lock = new ReentrantLock();

    public void sendTicket(){
        //加锁
        lock.lock();

        try {
            if(ticketCount > 0){
                ticketCount --;
                System.out.println(Thread.currentThread().getName()+"surplus :" + ticketCount);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //解锁
            lock.unlock();
        }
    }
}
