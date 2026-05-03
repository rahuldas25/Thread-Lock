class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");

    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        Thread LowPriority = new Thread(() -> {
            while (true) {
                System.out.println("Low priority thread running.......");
            }
        });
        LowPriority.setPriority(Thread.MIN_PRIORITY);

        Thread HighPriority = new Thread(() -> {
            while (true) {
                System.out.println("High priority thread running.......");
            }
        });
        HighPriority.setPriority(Thread.MAX_PRIORITY);
        LowPriority.start();
        HighPriority.start();
    }
}
