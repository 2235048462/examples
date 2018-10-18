package Exception;

class MoreCatch {
    public static void main ( String[] args ) {
        Demo demo = new Demo ();
        try {
            int x = demo.div ( 4, 0 );
            System.out.println ( "X=" + x );
        } catch (ArithmeticException e) {
            System.out.println ( e.toString () );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ( e.toString () );
        } catch (Exception e) {
            System.out.println ( e.toString () );
        }
        System.out.println ( "Over..." );
    }
}

class Demo {
    int div ( int a, int b ) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int[] arr = new int[a];
        System.out.println ( arr[4] );// 第一次异常
        return a / b;// 第二次异常
    }
}
