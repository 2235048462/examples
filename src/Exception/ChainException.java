package Exception;

public class ChainException {
    public static void main ( String[] args ) {
        int n = 20, result = 0;
        try {
            result = n / 0;
            System.out.println ( "���Ϊ:" + result );
        } catch (ArithmeticException e) {
            System.out.println ( "�������쳣:" + e );
            try {
                throw new NumberFormatException ();
            } catch (NumberFormatException ex) {
                System.out.println ( "�ֶ��׳���ʽ�쳣:" + ex );
            }
        }
    }
}
