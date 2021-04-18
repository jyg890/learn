package thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author JYG
 * @description 解决锁公平性
 * @create 2021−01-08 1:54 下午
 */
public class TicketLock {
    //service  Num
    private AtomicInteger serviceNum = new AtomicInteger();
    //ticket   Num
    private AtomicInteger ticketNum = new AtomicInteger();

    //新增一个线程池来存储每一个排队号
    private ThreadLocal<Integer> ticketNumHolder = new ThreadLocal<Integer>();
    //获取锁，如果获取成功 返回当前线程的排队号 获取排队号用于释放锁
    public int lock(){
        int currentTicketNum = ticketNum.incrementAndGet();
        ticketNumHolder.set(currentTicketNum);
        while (currentTicketNum != serviceNum.get()){
            //nothing
        }

        return currentTicketNum;
    }

    //释放锁  传入当前持有锁的线程的排队号
    private void unLock(){
        Integer integer = ticketNumHolder.get();
        serviceNum.compareAndSet(integer,integer + 1);
    }

/*
 *
 * 上面的实现方式是，
 * 线程获取锁之后，
 *
 * 将它的排队号返回，
 * 等该线程释放锁的时候，
 * 需要将该排队号传入。
 * 但这样是有风险的，
 * 因为这个排队号是可以被修改的，
 * 一旦排队号被不小心修改了，
 * 那么锁将不能被正确释放。
 * 一种更好的实现方式如下：
 *
 *
 */
}
