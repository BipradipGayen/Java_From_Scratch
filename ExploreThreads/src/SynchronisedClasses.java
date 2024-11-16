public class SynchronisedClasses {
    private  int arr[];
    private int stackTop;

    Object lock1;

    public SynchronisedClasses(int capacity)
    {
        arr = new int[capacity];
        stackTop = -1;
        lock1 = new Object();

    }

    public boolean isFull()
    {
        return stackTop >= arr.length-1;
    }

    public boolean isEmpty()
    {
        return stackTop < 0;
    }

    //as synhronised lock objects
//    public boolean push(int element)
//    {
//        synchronized (lock1){
//            if (isFull())
//                return false;
//
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//            }
//            ;
//
//            arr[++stackTop] = element;
//            return true;
//        }
//    }
//
//    public int pop()
//    {
//        synchronized (lock1){
//            if (isEmpty())
//                return Integer.MIN_VALUE;
//
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//            }
//            return arr[stackTop--];
//        }
//    }


    // as synchronised methods
    public synchronized boolean push(int element)
    {
        if (isFull())
            return false;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        ;

        arr[++stackTop] = element;
        return true;
    }

    public synchronized int pop()
    {
        if (isEmpty())
            return Integer.MIN_VALUE;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        return arr[stackTop--];
    }

}
