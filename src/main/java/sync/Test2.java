package sync;

/**
 * @author JYG
 * @description
 * @create 2021−03-10 3:25 下午
 */
public class Test2 extends Thread{

        private int i;
        public void run() {
            for(;i<100;i++) {
                System.out.println(getName()+" "+i);
            }
        }

        public static void main(String[] args) {
            for(int i=0;i<100;i++) {
                //调用Thread的currentThread方法获取当前线程
                System.out.println(Thread.currentThread().getName()+" "+i);
                if(i==20) {
                    new Test2().start();
                    new Test2().start();
                }
            }

        }


}
