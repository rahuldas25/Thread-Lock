class AutoSave extends Thread {
    public void run() {
        while (true) {
            System.out.println("Auto save running.......with daemon thread");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}