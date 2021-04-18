package thread;

/**
 * @author JYG
 * @description
 * @create 2021−03-11 10:11 上午
 */
public class Test03 extends Thread{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "开始-----");
        System.out.println("执行" + name + "代码块");
        System.out.println(name + "执行结束");
    }
}
