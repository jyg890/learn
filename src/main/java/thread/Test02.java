package thread;

/**
 * @author JYG
 * @description
 * @create 2021−03-11 10:11 上午
 */
public class Test02{

      static Object object =   new Object();
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                        synchronized (object){

                            object.wait();
                        }
                    System.out.println("--------1");
                }catch (Exception e ){
                    e.printStackTrace();
                }
            }
        });

        thread.start();
try {
    Thread.sleep(1000);
}catch (Exception e){

}

        System.out.println("--------2");
        thread.interrupt();

    }
}
