class joinThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                System.out.println("Thread 1: " + i);
            }
        });

        Thread t12 = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                System.out.println("Thread 2: " + i);
            }
        });

        t1.start();
        t12.start();
        // t1.join();
        // t12.join();
        System.out.print("Done");
    }
}