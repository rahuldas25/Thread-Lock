class MyThread extends Thread {
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

public class ExtendsThreadClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        // t1.start(); Exception Occured
        t2.start();
    }
}