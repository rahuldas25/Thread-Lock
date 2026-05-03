public class DownloadFile extends Thread {
    public void run() {
        try {
            System.out.println("Downloading file.......");
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Download complete!");
    }
}
