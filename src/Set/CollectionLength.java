package Set;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionLength {
    public static void main ( String[] args ) {
        int size;
        System.out.println ( "����ʵ��." );
        HashSet collection = new HashSet ();
        collection.add ( "Yellow." );
        collection.add ( "White." );
        collection.add ( "Green." );
        collection.add ( "Blue." );
        System.out.println ( "��������:" );
        Iterator iterator;
        iterator = collection.iterator ();
        while (iterator.hasNext ()) {
            System.out.println ( iterator.next () + "  " );
        }
        size = collection.size ();
        if (collection.isEmpty ()) {
            System.out.println ( "�����ǿյ�..." );
        } else {
            System.out.println ( "���ϳ���:" + size );
        }
        System.out.println ();
    }
}
