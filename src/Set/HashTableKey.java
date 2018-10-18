package Set;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableKey {
    public static void main ( String[] args ) {
        Hashtable hashtable = new Hashtable ();
        hashtable.put ( "1", "One" );
        hashtable.put ( "2", "Two" );
        hashtable.put ( "3", "Three" );
        Enumeration enumeration = hashtable.keys ();
        while (enumeration.hasMoreElements ()) {
            System.out.println ( enumeration.nextElement () );
        }
    }
}
