package thread;

/**
 * @author JYG
 * @description 车票
 * @create 2021−01-05 4:40 下午
 */
public class Ticket {
    private int ticketCount = 30;

    public synchronized void sendTicket(){
        if(ticketCount > 0){
            ticketCount --;
            System.out.println(Thread.currentThread().getName()+"surplus :" + ticketCount);
        }
    }
}
