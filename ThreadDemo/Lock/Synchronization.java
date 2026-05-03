
class Counter {
    int count = 0;

    void increment() {

        System.out.println("before");
        synchronized (this) {
            // System.out.println("inside synchornized block");
            count++;
        }
        System.out.println("after");
    }

    void increment1() {
        count++;
    }
}

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        // c.increment();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    // c.increment();
                    c.increment1();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    // c.increment();
                    c.increment1();
                }
            }
        });

        t1.start();
        t2.start();
        t2.join();
        t1.join();
        System.out.println(c.count);
    }
}