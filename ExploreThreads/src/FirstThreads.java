import java.lang.Thread;
public class FirstThreads extends Thread{
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside thread " + Thread.currentThread()+ " " + i);
        }
    }

    FirstThreads(String name)
    {
        super(name);
    }

}
