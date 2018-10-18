package Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin {
    public static void main ( String[] args ) {
        List list = Arrays.asList ( "zero one Two three five six one three four".split ( " " ) );
        System.out.println ( list );
        System.out.println ( "MAX:" + Collections.max ( list ) );
        System.out.println ( "MIN:" + Collections.min ( list ) );
    }
}
