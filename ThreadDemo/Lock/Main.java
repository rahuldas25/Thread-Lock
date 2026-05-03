public class Main {
    public static void main(String[] args) {

        ShareBuffer buffer = new ShareBuffer();
        Producer p1 = new Producer(buffer);
        Consumer c1 = new Consumer(buffer);
        p1.start();
        c1.start();
    }
}
