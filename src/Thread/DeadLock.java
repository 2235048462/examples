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
            System.out.println ( new Date ().toString () + " LockA 开始执行" );
            while (true) {
                synchronized (DeadLock.obj1) {
                    System.out.println ( new Date ().toString () + " LockA 锁住obj1" );
                    Thread.sleep ( 3000 );// 此处等待是给B能锁住机会
                    synchronized (DeadLock.obj2) {
                        System.out.println ( new Date ().toString () + " LockA 锁住obj2" );
                        Thread.sleep ( 60 * 1000 );// 占用不放
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
            System.out.println ( new Date ().toString () + " LockB 开始执行" );
            while (true) {
                synchronized (DeadLock.obj2) {
                    System.out.println ( new Date ().toString () + " LockB 锁住obj2" );
                    Thread.sleep ( 3000 );// 此处等待是给A能锁住机会
                    synchronized (DeadLock.obj1) {
                        System.out.println ( new Date ().toString () + " LockB 锁住obj1" );
                        Thread.sleep ( 60 * 1000 );
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
