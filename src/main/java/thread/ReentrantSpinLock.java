package thread;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author JYG
 * @description 可重入锁
 * @create 2021−01-08 10:53 上午
 */
public class ReentrantSpinLock {
    private AtomicReference<Thread> cas = new AtomicReference<Thread>();
    private int count;

    public void lock(){
        Thread current = Thread.currentThread();
        //如果当前线程已经获取到了锁，线程数加一 ，然后返回
        if(current == cas.get()){
            count ++;
            return;
        }
        //如果没有获取到锁
        while (!cas.compareAndSet(null,current)){
            //nothing
        }
    }

    public void unLock() {
        Thread cur = Thread.currentThread();
        if (cur == cas.get()) {
            if (count > 0) {
                //如果大于0，表示当前线程多次获取了该锁，释放锁通过count减一来模拟
                count--;
            } else {
                //count == 0,可以释放锁，这样就能保证获取锁的次数与释放锁的次数是一致的了。
                cas.compareAndSet(cur, null);
            }
        }
    }
}
