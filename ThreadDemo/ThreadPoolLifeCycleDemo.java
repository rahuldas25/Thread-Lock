import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.*;

class ThreadpoolDemo implements Runnable {
    private final int taskId;

    public ThreadpoolDemo(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() { // 3) Running on thread with run method
        System.out.println(Thread.currentThread().getName() + " -is Started " + taskId);

        try {
            Thread.sleep(2000); // sleep

            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " is waiting " + taskId);
                this.wait(2000); // waiting for 2 sec
            }
            System.out.println(Thread.currentThread().getName() + " -Task " + taskId + " Completed");
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            // System.out.println("Thread Interupt!!!");
        }
    }
}

public class ThreadPoolLifeCycleDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);// 1) Threadpool create
        System.out.println("ThreadPool Created successfully!!!");
        for (int i = 0; i <= 5; i++) {
            executorService.submit(new ThreadpoolDemo(i));// 2)thread picks task and go for runnable.
        }
        executorService.shutdown();
        // System.out.println("Thread pool shutdown initiated!!!");

        try {

            // Wait for all thread to terminate
            Thread.sleep(2000);
            System.out.println("Thread pool shutdown initiated!!!");
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
                System.out.println("Thread pool shutdown forcefully!!!");
            }
        } catch (InterruptedException e) {
            executorService.shutdown();
            // e.printStackTrace();
        }
        System.out.println("All thread are Terminated!!!");
    }
}
