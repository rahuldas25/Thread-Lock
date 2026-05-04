class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running " + getPriority());

    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        // Thread LowPriority = new Thread(() -> {
        // while (true) {
        // System.out.println("Low priority thread running.......");
        // }
        // });
        // LowPriority.setPriority(Thread.MIN_PRIORITY);

        // Thread HighPriority = new Thread(() -> {
        // while (true) {
        // System.out.println("High priority thread running.......");
        // }
        // });
        // HighPriority.setPriority(Thread.MAX_PRIORITY);
        // LowPriority.start();
        // HighPriority.start();
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();

        m1.setName("High priority!!");
        m2.setName("Low priority!!");

        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY);

        m1.start();
        m2.start();
    }
}
