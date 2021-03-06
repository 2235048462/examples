package Exception;

public class ChainException {
    public static void main ( String[] args ) {
        int n = 20, result = 0;
        try {
            result = n / 0;
            System.out.println ( "结果为:" + result );
        } catch (ArithmeticException e) {
            System.out.println ( "发算术异常:" + e );
            try {
                throw new NumberFormatException ();
            } catch (NumberFormatException ex) {
                System.out.println ( "手动抛出链式异常:" + ex );
            }
        }
    }
}
