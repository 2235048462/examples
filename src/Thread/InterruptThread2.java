package Thread;

public class InterruptThread2 implements Runnable {
    public static void main ( String[] args ) {
        InterruptThread2 thread2 = new InterruptThread2 ();
        Thread thread = new Thread ( thread2 );
        thread.start ();
        try {
            Thread.sleep ( 2000 );
        } catch (InterruptedException e) {
        }
        System.out.println ( "main函数-中断其他进程" );
        thread.interrupt ();
        System.out.println ( "main函数-离开..." );
    }

    public void run () {
        try {
            System.out.println ( "run函数-将运行work2()" );
            work2 ();
            System.out.println ( "run函数-返回work2()" );
        } catch (InterruptedException e) {
            System.out.println ( "run函数-中断work2()" );
            return;
        }
        System.out.println ( "run函数-休眠后执行..." );
        System.out.println ( "run函数-正常离开..." );
    }

    public void work2 () throws InterruptedException {
        while (true) {
            if (Thread.currentThread ().isInterrupted ()) {
                System.out.println ( "C isInterrupted(): " + Thread.currentThread ().isInterrupted () );
                Thread.sleep ( 2000 );
                System.out.println ( "D isInterrupted(): " + Thread.currentThread ().isInterrupted () );
            }
        }
    }

    public void work () throws InterruptedException {
        while (true) {
            for (int i = 0; i < 100000; i++) {
                int j = i * 2;
            }
            System.out.println ( "A isInterrupted(): " + Thread.currentThread ().isInterrupted () );
            if (Thread.interrupted ()) {
                System.out.println ( "B isInterrupted: " + Thread.currentThread ().isInterrupted () );
                throw new InterruptedException ();
            }
        }
    }
}
