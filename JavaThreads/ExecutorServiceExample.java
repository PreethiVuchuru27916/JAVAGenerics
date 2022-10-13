import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.*;

public class ExecutorServiceExample extends Thread{

    public void run(){
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);//Creates 2 threads that will be reused for any number of tasks so that there wont be individual thread created for each task

        for(int i=0; i<5; i++) {
            ExecutorServiceExample ex = new ExecutorServiceExample();
            executorService.execute(ex);
        }

        executorService.shutdown();
    }
}