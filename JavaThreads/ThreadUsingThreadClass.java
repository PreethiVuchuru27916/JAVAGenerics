import java.util.*;

public class ThreadUsingThreadClass extends Thread{
    
    public void run() {
        System.out.println("Thread being executed");
    }

    public static void main(String args[]) {
        ThreadUsingThreadClass th = new ThreadUsingThreadClass();
        th.start();
        ThreadUsingThreadClass th1 = new ThreadUsingThreadClass();
        th1.start();
    }
}