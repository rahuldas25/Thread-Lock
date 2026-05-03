import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String> {
    private final String name;

    public MyCallable(String name) {
        this.name = name;
    }

    public String call() throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("callable").append(name).append(" is running ").append(i).append("\n");
            Thread.sleep(500);
        }
        return sb.toString();
    }
}

public class CallableDemo {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(1);

        Callable<String> callable = new MyCallable("Thread 1");
        Callable<String> callable2 = new MyCallable("Thread 2");
        try {
            Future<String> future1 = service.submit(callable);
            Future<String> future2 = service.submit(callable2);

            System.out.println("Result from first task:");
            System.out.println(future1.get());

            System.out.println("Result from second task:");
            System.out.println(future2.get());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
    }
}
