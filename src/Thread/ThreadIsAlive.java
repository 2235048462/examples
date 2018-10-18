package Thread;

public class ThreadIsAlive extends Thread {
    public static void main ( String[] args ) {
        ThreadIsAlive thread_2 = new ThreadIsAlive ();
        thread_2.setName ( "Thread Name..." );
        System.out.println ( "线程开始前状态:" + thread_2.isAlive () );
        thread_2.start ();
        System.out.println ( "线程开始后状态:" + thread_2.isAlive () );
        for (int i = 0; i < 10; i++) {
            thread_2.printMsg ();
        } // thread_2.run ();
        System.out.println ( "主函数main结束后线程状态:" + thread_2.isAlive () );
    }

    public void run () {
        for (int i = 0; i < 10; i++) {
            printMsg ();
        }
    }

    public void printMsg () {
        Thread thread = Thread.currentThread ();
        String threadName = thread.getName ();
        System.out.println ( "ThreadName=" + threadName );
    }
}
