package thread;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author JYG
 * @description 自旋锁
 * @create 2021−01-07 5:21 下午
 */
public class SpinLock {

    private AtomicReference<Thread> cas = new AtomicReference<Thread>();

    public void lock(){
        Thread current = Thread.currentThread();
        while (!cas.compareAndSet(null,current)){
            //nothing
        };

    }

    public void unLock(){
        Thread current = Thread.currentThread();
        cas.compareAndSet(current, null);
    }

}
