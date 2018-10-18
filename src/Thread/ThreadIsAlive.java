package Thread;

public class ThreadIsAlive extends Thread {
    public static void main ( String[] args ) {
        ThreadIsAlive thread_2 = new ThreadIsAlive ();
        thread_2.setName ( "Thread Name..." );
        System.out.println ( "�߳̿�ʼǰ״̬:" + thread_2.isAlive () );
        thread_2.start ();
        System.out.println ( "�߳̿�ʼ��״̬:" + thread_2.isAlive () );
        for (int i = 0; i < 10; i++) {
            thread_2.printMsg ();
        } // thread_2.run ();
        System.out.println ( "������main�������߳�״̬:" + thread_2.isAlive () );
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
