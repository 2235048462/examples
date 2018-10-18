package Thread;

import java.util.Date;

public class DeadLock {
    public static String obj1 = "obj1";
    public static String obj2 = "obj2";

    public static void main ( String[] args ) {
        LockA lockA = new LockA ();
        new Thread ( lockA ).start ();
        LockB lockB = new LockB ();
        new Thread ( lockB ).start ();
    }
}

class LockA implements Runnable {
    public void run () {
        try {
            System.out.println ( new Date ().toString () + " LockA ��ʼִ��" );
            while (true) {
                synchronized (DeadLock.obj1) {
                    System.out.println ( new Date ().toString () + " LockA ��סobj1" );
                    Thread.sleep ( 3000 );// �˴��ȴ��Ǹ�B����ס����
                    synchronized (DeadLock.obj2) {
                        System.out.println ( new Date ().toString () + " LockA ��סobj2" );
                        Thread.sleep ( 60 * 1000 );// ռ�ò���
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}

class LockB implements Runnable {
    public void run () {
        try {
            System.out.println ( new Date ().toString () + " LockB ��ʼִ��" );
            while (true) {
                synchronized (DeadLock.obj2) {
                    System.out.println ( new Date ().toString () + " LockB ��סobj2" );
                    Thread.sleep ( 3000 );// �˴��ȴ��Ǹ�A����ס����
                    synchronized (DeadLock.obj1) {
                        System.out.println ( new Date ().toString () + " LockB ��סobj1" );
                        Thread.sleep ( 60 * 1000 );
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
