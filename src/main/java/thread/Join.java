package thread;

/**
 * @author JYG
 * @description  main方法在启动之后 除了main主线程还有join的子线程 在main中的循环体内又加入了一个子线程用来抢夺主线程
 * @create 2021−03-11 9:44 上午
 */
public class Join extends Thread{

    //构建一个有参构造器用于指定线程的名字
    public Join(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0;i < 10;i++){
            System.out.println(getName() +" "+ i);
        }
    }

    //main方法
    public static void main(String[] args) throws InterruptedException {

        Join join = new Join("new thread");
        join.start();

        for (int i = 0;i < 10;i ++){
            if(i == 5){
                Join jt = new Join("join的线程");
                jt.start();
                //main线程调用了jt线程的join方法，main线程
                //必须等jt执行结束才会向下执行
                jt.join();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

    }
}
