import java.lang.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

class MyRejectedExecutionHandler implements RejectedExecutionHandler{
    
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Rejected Handler");
    }

}

class Worker extends Thread {
    
    int id;
    public Worker(int id)
    {
        this.id=id;
        System.out.println("Worker "+id+" Created");   
    }
    public void run() {
        System.out.println("Thread getting executed");
    }
}

public class RejectedExecutionHandlerExample {
    public static void main(String args[]){
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        RejectedExecutionHandler handler=new MyRejectedExecutionHandler();
        executorService.setRejectedExecutionHandler(handler);
        Worker[] workers=new Worker[10];
        for(int i=0;i<10;i++){
            workers[i]=new Worker(i);
            executorService.execute(workers[i]);
            if(i==6)
                executorService.shutdown();// The executor is terminated intentionally to check the RejectedExecutionHandler
        }
    }
}
