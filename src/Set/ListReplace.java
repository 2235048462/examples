package Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListReplace {
    public static void main ( String[] args ) {
        List list = Arrays.asList ( "zero one Two three five six one three four".split ( " " ) );
        System.out.println ( "List:" + list );
        Collections.replaceAll ( list, "one", "hundrea" );
        System.out.println ( "replaceAll:" + list );
    }
}
