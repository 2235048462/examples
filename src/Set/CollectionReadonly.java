package Set;

import java.util.*;

public class CollectionReadonly {
    public static void main ( String[] args ) {
        List stuff = Arrays.asList ( new String[]{"a", "b"} );
        List list = new ArrayList ( stuff );
        list = Collections.unmodifiableList ( list );
        try {
            list.set ( 0, "new value" );
        } catch (UnsupportedOperationException e) {
        }
        Set set = new HashSet ( stuff );
        set = Collections.unmodifiableSet ( set );
        Map map = new HashMap ();
        map = Collections.unmodifiableMap ( map );
        System.out.println ( list );
        System.out.println ( "集合现在只读..." );
    }
}
