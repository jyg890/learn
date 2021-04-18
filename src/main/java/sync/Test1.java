package sync;

/**
 * @author JYG
 * @description  这是直接用于方法 相当于test中方法使用lock来锁定的效果  但是实际获取的是test1类的监视器 monitor
 * 更进一步 如果修饰的是static方法 则锁定的是该类的所有实例
 * @create 2021−03-10 10:57 上午
 */
public class Test1 implements Runnable{
    @Override
    public synchronized void run() {
        //something
    }
}
