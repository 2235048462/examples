package Thread;

class MyThread extends Thread {
    boolean waiting = true;
    boolean ready = false;

    MyThread () {
    }

    public void run () {
        Thread thread = Thread.currentThread ();
        String threadName = thread.getName ();
        while (waiting)
            System.out.println ( "waiting:" + waiting );
        System.out.println ( "waiting..." );
        startWait ();
        try {
            Thread.sleep ( 1000 );
        } catch (Exception exc) {
            System.out.println ( threadName + "interrupted..." );
        }
        System.out.println ( threadName + "terminating..." );
    }

    synchronized void startWait () {
        try {
            while (!ready)
                wait ();
        } catch (InterruptedException exc) {
            System.out.println ( "wait() interrupted..." );
        }
    }

    synchronized void notice () {
        ready = true;
        notify ();
    }
}

public class ThreadStateDetection {
    public static void main ( String[] args ) throws Exception {
        MyThread thread = new MyThread ();
        thread.setName ( "Thread #1" );
        showThreadStatus ( thread );
        thread.start ();
        Thread.sleep ( 50 );
        showThreadStatus ( thread );
        thread.waiting = false;
        Thread.sleep ( 50 );
        showThreadStatus ( thread );
        thread.notice ();
        Thread.sleep ( 50 );
        showThreadStatus ( thread );
        while (thread.isAlive ())
            System.out.println ( "alive..." );
        showThreadStatus ( thread );
    }

    static void showThreadStatus ( Thread thread ) {
        System.out.println ( thread.getName () + "´æ»î:" + thread.isAlive () + "×´Ì¬:" + thread.getState () );
    }
}