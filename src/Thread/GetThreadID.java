package Thread;

public class GetThreadID extends Object implements Runnable {
    private ThreadID var;

    public GetThreadID ( ThreadID v ) {
        this.var = v;
    }

    private static void print ( String msg ) {
        String name = Thread.currentThread ().getName ();
        System.out.println ( name + ":" + msg );
    }

    public static void main ( String[] args ) {
        ThreadID threadID = new ThreadID ();
        GetThreadID shared = new GetThreadID ( threadID );
        try {
            Thread threadA = new Thread ( shared, "threadA" );
            threadA.start ();
            Thread.sleep ( 500 );
            Thread threadB = new Thread ( shared, "threadB" );
            threadB.start ();
            Thread.sleep ( 500 );
            Thread threadC = new Thread ( shared, "threadC" );
            threadC.start ();
        } catch (InterruptedException e) {

        }
    }

    public void run () {
        try {
            print ( "Var getThreadID:" + var.getThreadID () );
            Thread.sleep ( 2000 );
            print ( "Var getThreadID:" + var.getThreadID () );
        } catch (InterruptedException e) {
        }
    }
}

class ThreadID extends ThreadLocal {
    private int nextID;

    public ThreadID () {
        nextID = 10001;
    }

    private static void print ( String msg ) {
        String name = Thread.currentThread ().getName ();
        System.out.println ( name + ":" + msg );
    }

    private synchronized Integer getNewID () {
        Integer id = new Integer ( nextID );
        nextID++;
        return id;
    }

    @Override
    protected Object initialValue () {
        print ( "初始化对象..." );
        return getNewID ();
    }

    public int getThreadID () {
        Integer id = (Integer) get ();
        return id.intValue ();
    }
}