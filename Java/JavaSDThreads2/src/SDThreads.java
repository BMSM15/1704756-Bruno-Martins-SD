public class SDThreads implements Runnable {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SDThreads sd = new SDThreads();
        Thread thread = new Thread(sd);
        thread.start();

    }

    @Override
    public void run() {
        System.out.println("Hello World from a thread");
    }
}