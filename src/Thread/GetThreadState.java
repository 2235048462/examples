package Thread;

public class GetThreadState {
    public static void main ( String[] args ) throws Exception {
        MyThread2 thread2 = new MyThread2 ();
        thread2.setName ( "MyThread2" );
        showThreadStatus ( thread2 );
        thread2.start ();
        Thread.sleep ( 50 );
        showThreadStatus ( thread2 );
        thread2.waiting = false;
        Thread.sleep ( 50 );
        showThreadStatus ( thread2 );
        thread2.notice ();
        Thread.sleep ( 50 );
        showThreadStatus ( thread2 );
        while (thread2.isAlive ()) {
            System.out.println ( "Alive..." );
        }
        showThreadStatus ( thread2 );
    }

    static void showThreadStatus ( Thread thread ) {
        System.out.println ( thread.getName () + "存活:" + thread.isAlive () + "状态:" + thread.getState () );
    }
}

class MyThread2 extends Thread {
    boolean waiting = true;
    boolean ready = false;

    MyThread2 () {
    }

    public void run () {
        String threadName = Thread.currentThread ().getName ();
        System.out.println ( threadName + "启动..." );
        while (waiting) {
            System.out.println ( "等待:" + waiting );
        }
        System.out.println ( "等待..." );
        startWait ();
        try {
            Thread.sleep ( 1000 );
        } catch (Exception e) {
            System.out.println ( threadName + "中断." );
        }
        System.out.println ( threadName + "结束..." );
    }

    synchronized void startWait () {
        try {
            while (!ready) wait ();
        } catch (InterruptedException e) {
            System.out.println ( "wait()中断..." );
        }
    }

    synchronized void notice () {
        ready = true;
        notify ();
    }
}
