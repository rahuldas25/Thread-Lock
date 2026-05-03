class ShareBuffer {
    private int data;
    private boolean hasData = false;

    public synchronized void prooduce(int value) throws InterruptedException {
        while (hasData) {
            wait();
        }
        data = value;
        System.out.println("Produce: " + data);
        hasData = true;
        notify();
    }

    public synchronized void consumer() throws InterruptedException {
        while (!hasData) {
            wait();
        }
        // data = value;
        System.out.println("Consume: " + data);
        hasData = false;
        notify();
    }

}
