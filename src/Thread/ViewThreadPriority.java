package Thread;

public class ViewThreadPriority {
    private static Runnable makeRunnable () {
        Runnable runnable = new Runnable () {
            @Override
            public void run () {
                for (int i = 0; i < 5; i++) {
                    Thread thread = Thread.currentThread ();
                    System.out.println ( "run����-���ȼ�:" + thread.getPriority () + "\nrun����-�߳�:" + thread.getName () );
                    try {
                        Thread.sleep ( 2000 );
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        return runnable;
    }

    public static void main ( String[] args ) {
        System.out.println ( "main����-���ȼ�:" + Thread.currentThread ().getPriority () );
        System.out.println ( "main����-�߳�:" + Thread.currentThread ().getName () );
        Thread thread = new Thread ( makeRunnable (), "ThreadA" );
        thread.start ();
        try {
            Thread.sleep ( 3000 );
        } catch (InterruptedException e) {
        }
        System.out.println ( "main����-�߳����ȼ�:" + thread.getPriority () );
    }
}
