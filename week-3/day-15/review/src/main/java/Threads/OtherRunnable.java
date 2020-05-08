package Threads;

public class OtherRunnable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.println("Just woke up!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
