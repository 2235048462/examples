package Thread;

public class InterruptThread extends Thread {
    public static void main ( String[] args ) throws Exception {
        Thread thread = new InterruptThread ();
        thread.start ();
        System.out.println ( "��50��֮�ڰ�������ж��߳�..." );
        System.in.read ();
        thread.interrupt ();
        thread.join ();
        System.out.println ( "�߳��Ѿ��˳�..." );
    }

    public void run () {
        try {
            sleep ( 50000 );// �ӳ�50��
        } catch (InterruptedException e) {
            System.err.println ( e.getMessage () );
        }
    }
}
