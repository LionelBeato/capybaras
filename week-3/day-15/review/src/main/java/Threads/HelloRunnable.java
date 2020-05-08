package Threads;

public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello, from a thread!");
    }

    public static void main(String args[]) throws InterruptedException {
//         this first thread will resolve last
//        why is that? in OtherRunnable, the thread gets put to sleep
//        since we're not putting out main thread to sleep
//        the rest of the code will resolve first
        (new Thread(new OtherRunnable())).start();

        (new Thread(new HelloRunnable())).start();
        (new Thread(new HelloRunnable())).start();
        (new Thread(new HelloRunnable())).start();
    }
}
