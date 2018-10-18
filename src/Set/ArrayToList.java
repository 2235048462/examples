package Set;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main ( String[] args ) {
        int n = 5; //5¸öÔªËØ
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = String.valueOf ( i );
        }
        List <String> list = Arrays.asList ( array );
        System.out.println ();
        for (String l : list) {
            System.out.print ( l + "  " );
        }
    }
}
