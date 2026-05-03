import java.util.concurrent.FutureTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private final int taskId;

    public WorkerThread(int taskId) {
        this.taskId = taskId;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is processing task: " + taskId);
        try {
            Thread.sleep(2000); // Simulate task execution time
        } catch (InterruptedException e) {
            System.out.println("Task interrupted: " + e.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + " finished task: " + taskId);
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            executorService.submit(new WorkerThread(i));
        }

        // Shutdown the executor service
        executorService.shutdown();
    }
}
