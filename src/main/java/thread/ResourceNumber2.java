package thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author JYG
 * @description
 * @create 2021−01-05 5:26 下午
 */
public class ResourceNumber2 {

    private int num = 0;

    private Lock lock = new ReentrantLock();
    Condition A = lock.newCondition();
    Condition B = lock.newCondition();
    Condition C = lock.newCondition();
    Condition D = lock.newCondition();


    public void incrementA() throws InterruptedException {

        lock.lock();
        try {
            //如果num不等于0，则线程等待（1、判断）
            while (num != 0){
                A.await(100, TimeUnit.MILLISECONDS);
            }
            //2、执行
            num++;
            System.out.println(Thread.currentThread().getName()+":"+num);
            //唤醒所有等待的线程（3、通知）
            B.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void decrementB() throws InterruptedException {
        lock.lock();
        try {
            while (num != 1){
                B.await();
            }
            num--;
            System.out.println(Thread.currentThread().getName()+":"+num);
            C.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void incrementC() throws InterruptedException {
        lock.lock();
        try {
            //如果num不等于0，则线程等待（1、判断）
            while (num != 0){
                C.await();
            }
            //2、执行
            num++;
            System.out.println(Thread.currentThread().getName()+":"+num);
            //唤醒所有等待的线程（3、通知）
            D.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void decrementD() throws InterruptedException {
        lock.lock();
        try {
            while (num != 1){
                D.await();
            }
            num--;
            System.out.println(Thread.currentThread().getName()+":"+num);
            A.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
