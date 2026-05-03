class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Thread: " + Thread.currentThread().getId() + " is running " + i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Thread Interupt!!!");
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();
    }
}
