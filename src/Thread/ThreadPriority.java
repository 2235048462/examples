package Thread;

public class ThreadPriority extends Thread {
    private int countDown = 5;
    private volatile double aDouble = 0;

    public ThreadPriority ( int priority ) {
        setPriority ( priority );
        start ();
    }

    public static void main ( String[] args ) {
        new ThreadPriority ( Thread.MAX_PRIORITY );
        for (int i = 0; i < 5; i++) {
            new ThreadPriority ( Thread.MIN_PRIORITY );
        }
    }

    public String toString () {
        return super.toString () + ":" + countDown;
    }

    public void run () {
        while (true) {
            for (int i = 1; i < 10000; i++) {
                aDouble = aDouble + (Math.PI + Math.E) / (double) i;
            }
            System.out.println ( this );
            if (--countDown == 0)
                return;
        }
    }
}
