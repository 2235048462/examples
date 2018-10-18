package Thread;

public class GetAllThreads extends Thread {
    public static void main ( String[] args ) {
        GetAllThreads threads = new GetAllThreads ();
        threads.setName ( "Thread #1..." );
        threads.start ();
        ThreadGroup currentGroup = Thread.currentThread ().getThreadGroup ();
        int noThreads = currentGroup.activeCount ();
        Thread[] listThreads = new Thread[noThreads];
        currentGroup.enumerate ( listThreads );
        for (int i = 0; i < noThreads; i++) {
            System.out.println ( "Ïß³ÌºÅ: " + i + "  " + listThreads[i].getName () );
        }
    }
}
