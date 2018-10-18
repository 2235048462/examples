package Exception;

public class OverloadException {
    public static void main ( String[] args ) {
        OverloadException e = new OverloadException ();
        try {
            System.out.println ( method ( 10, 20.0 ) );
            System.out.println ( method ( 10.0, 20 ) );
            System.out.println ( method ( 10.0, 20.0 ) );
            System.out.println ( e.method ( 10 ) );
        } catch (Exception ex) {
            System.err.println ( "exception occoure:" + ex );
        }
    }

    static double method ( int x, double y ) throws Exception {
        return x + y;
    }

    static double method ( double x, double y ) {
        return x + y - 3;
    }

    double method ( int i ) throws Exception {
        return i / 0;
    }

    boolean method ( boolean b ) {
        return !b;
    }
}
