public class Main {
    public static void main(String[] args) {
////        Thread t1 = new FirstThreads("thread 1");
//        Thread t2 = new FirstThreads("thread 2");
//        System.out.println("starting thread");
////        t2.setDaemon(true);
////        t1.start();
//        t2.start();
//        System.out.println("Ending thread");
//
//
//        //UsingRunnable usr = new UsingRunnable();
//        Thread t1 = new Thread(new UsingRunnable());
//       // Thread t1 = new Thread(usr);
//        t1.start();



        SynchronisedClasses sc = new SynchronisedClasses((5));

        new Thread(() -> {
            int counter =0;
            while (++ counter<10)
                System.out.println("pushed:: " + sc.push(100));
            },"Pusher").start();

        new Thread(() -> {
            int counter =0;
            while (++ counter<10)
                System.out.println("Popped:: " + sc.pop());
        },"Popper").start();

        System.out.println("system is exiting");

    }
}