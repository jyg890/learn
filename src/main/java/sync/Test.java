package sync;

import javax.swing.*;

/**
 * @author JYG
 * @description  sync代码块中获取了实例的monitor监视器  如果实例相同 那么只有一个线程可以执行该代码块的内容
 * @create 2021−03-10 10:49 上午
 */
public class Test implements Runnable{

    Object look;
    @Override
    public void run() {

        synchronized (look){
            //something
        }

    }
}
