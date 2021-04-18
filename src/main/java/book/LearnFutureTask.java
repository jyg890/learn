package book;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author JYG
 * @description
 * @create 2021−04-18 12:51 下午
 */
public class LearnFutureTask implements Callable {

    @Override
    public Object call() throws Exception {
        return "hello";
    }

    public static void main(String[] args) {
        FutureTask<String> task = new FutureTask<String>(new LearnFutureTask());

        new Thread(task).start();


        try {
            String result = task.get();

            System.out.println(result);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
