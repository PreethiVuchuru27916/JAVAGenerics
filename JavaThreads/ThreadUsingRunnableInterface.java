public class ThreadUsingRunnableInterface implements Runnable{
    public void run(){
        System.out.println("Thread executed");
    }

    public static void main(String args[]) {
        ThreadUsingRunnableInterface th1 = new ThreadUsingRunnableInterface();
        Thread t = new Thread(th1);
        t.start();
    }
}