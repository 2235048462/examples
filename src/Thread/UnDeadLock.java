package Thread;

import java.util.Date;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class UnDeadLock {
    public static final Semaphore semaphore1 = new Semaphore ( 1 );
    public static final Semaphore semaphore2 = new Semaphore ( 1 );
    public static String obj1 = "obj1";
    public static String obj2 = "obj2";

    public static void main ( String[] args ) {
        LockAa lockAa = new LockAa ();
        new Thread ( lockAa ).start ();
        LockBb lockBb = new LockBb ();
        new Thread ( lockBb ).start ();
    }
}

class LockAa implements Runnable {
    public void run () {
        try {
            System.out.println ( new Date ().toString () + " LockA ��ʼִ��..." );
            while (true) {
                if (UnDeadLock.semaphore1.tryAcquire ( 1, TimeUnit.SECONDS )) {
                    System.out.println ( new Date ().toString () + " LockA ��ס obj1" );
                    if (UnDeadLock.semaphore2.tryAcquire ( 1, TimeUnit.SECONDS )) {
                        System.out.println ( new Date ().toString () + " LockA ��ס obj2" );
                        Thread.sleep ( 60 * 1000 );
                    } else {
                        System.out.println ( new Date ().toString () + " LockA �� obj2 ʧ��" );
                    }
                } else {
                    System.out.println ( new Date ().toString () + "LockA �� obj1 ʧ��" );
                }
                UnDeadLock.semaphore1.release ();// �ͷ�
                UnDeadLock.semaphore2.release ();
                Thread.sleep ( 1000 ); //���Ͻ��г���,��ʵ����²�ȷ��
            }
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}

class LockBb implements Runnable {
    public void run () {
        try {
            System.out.println ( new Date ().toString () + " LockB ��ʼִ��..." );
            while (true) {
                if (UnDeadLock.semaphore2.tryAcquire ( 1, TimeUnit.SECONDS )) {
                    System.out.println ( new Date ().toString () + " LockB ��ס obj2" );
                    if (UnDeadLock.semaphore1.tryAcquire ( 1, TimeUnit.SECONDS )) {
                        System.out.println ( new Date ().toString () + " LockB ��ס obj1" );
                        Thread.sleep ( 60 * 1000 );
                    } else {
                        System.out.println ( new Date ().toString () + " LockB �� obj1 ʧ��" );
                    }
                } else {
                    System.out.println ( new Date ().toString () + "LockB �� obj2 ʧ��" );
                }
                UnDeadLock.semaphore1.release ();// �ͷ�
                UnDeadLock.semaphore2.release ();
                Thread.sleep ( 10 * 1000 ); //���Ͻ��г���,��ʵ����²�ȷ��
            }
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
