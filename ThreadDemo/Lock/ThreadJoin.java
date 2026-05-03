
public class ThreadJoin {
    public static void main(String[] args) {
        DownoadFile file = new DownoadFile();
        file.start(); // start downloading
        try {
            file.join(); // wait for download to complete
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Now file is ready to use....");
    }
}
