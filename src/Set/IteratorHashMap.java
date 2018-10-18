package Set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class IteratorHashMap {
    public static void main ( String[] args ) {
        HashMap <String, String> hashMap = new HashMap ();
        hashMap.put ( "1", "1st" );
        hashMap.put ( "2", "2nd" );
        hashMap.put ( "3", "3rd" );
        Collection collections = hashMap.values ();
        Iterator iterator = collections.iterator ();
        while (iterator.hasNext ()) {
            System.out.println ( iterator.next () );
        }
    }
}
