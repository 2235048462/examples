package Thread;

public class GetThreadName extends Thread {
    public static void main ( String[] args ) {
        GetThreadName thread_2 = new GetThreadName ();
        thread_2.start ();
        for (int i = 0; i < 10; i++) {
            thread_2.printMsg ();
        }// thread_2.run ();
    }

    public void run () {
        for (int i = 0; i < 10; i++) {
            printMsg ();
        }
    }

    public void printMsg () {
        Thread thread = Thread.currentThread ();
        String threadName = thread.getName ();
        System.out.println ( "Thread Name:" + threadName );
    }
}
