public class UsingRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside Runnable thread " + Thread.currentThread()+ " " + i);
        }
    }
}
