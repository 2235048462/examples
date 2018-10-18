package Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListIntercept {
    public static void main ( String[] args ) {
        List list = Arrays.asList ( "one Two three Four five six one three Four".split ( " " ) );
        System.out.println ( "List:" + list );
        List sublist = Arrays.asList ( "three Four".split ( "  " ) );
        System.out.println ( "всап╠М:" + sublist );
        System.out.println ( "indexOfSubList:" + Collections.indexOfSubList ( list, sublist ) );
        System.out.println ( "lastIndexOfSubList:" + Collections.lastIndexOfSubList ( list, sublist ) );
    }
}
