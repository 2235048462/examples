package Thread;

public class InterruptThread extends Thread {
    public static void main ( String[] args ) throws Exception {
        Thread thread = new InterruptThread ();
        thread.start ();
        System.out.println ( "在50秒之内按任意键中断线程..." );
        System.in.read ();
        thread.interrupt ();
        thread.join ();
        System.out.println ( "线程已经退出..." );
    }

    public void run () {
        try {
            sleep ( 50000 );// 延迟50秒
        } catch (InterruptedException e) {
            System.err.println ( e.getMessage () );
        }
    }
}
