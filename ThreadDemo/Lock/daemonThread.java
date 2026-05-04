public class daemonThread {
    public static void main(String[] args) throws Exception {
        AutoSave t1=new AutoSave();
        t1.setDaemon(true);
        t1.start();

        System.out.println("User is Working.....");
        Thread.sleep(3000);
        System.out.println("user finish this work");
    }
}
