package Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LoopingMovingElements {
    public static void main ( String[] args ) {
        List list = Arrays.asList ( "one two three four five six".split ( " " ) );
        System.out.println ( "List:" + list );
        Collections.rotate ( list, 3 );
        System.out.println ( "rotate:" + list );
    }
}
