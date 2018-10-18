package Set;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionLength {
    public static void main ( String[] args ) {
        int size;
        System.out.println ( "集合实例." );
        HashSet collection = new HashSet ();
        collection.add ( "Yellow." );
        collection.add ( "White." );
        collection.add ( "Green." );
        collection.add ( "Blue." );
        System.out.println ( "集合数据:" );
        Iterator iterator;
        iterator = collection.iterator ();
        while (iterator.hasNext ()) {
            System.out.println ( iterator.next () + "  " );
        }
        size = collection.size ();
        if (collection.isEmpty ()) {
            System.out.println ( "集合是空的..." );
        } else {
            System.out.println ( "集合长度:" + size );
        }
        System.out.println ();
    }
}
