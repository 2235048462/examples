package Exception;

public class FinallyUsed {
    public static void main ( String[] args ) {
        new FinallyUsed ().doTheWork ();
    }

    public void doTheWork () {
        Object object = null;
        for (int i = 0; i < 5; i++) {
            try {
                object = makeObj ( i );
            } catch (IllegalArgumentException e) {
                System.err.println ( "Error:(" + e.getMessage () + ")." );
                return;
            } finally {
                System.err.println ( "��ִ�����..." );
                if (object == null)
                    System.exit ( 0 );
            }
            System.out.println ( object );
        }
    }

    public Object makeObj ( int type ) throws IllegalArgumentException {
        if (type == 1)
            throw new IllegalArgumentException ( "����ָ������:" + type );
        return new Object ();
    }
}
