package Set;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionRemove {
    public static void main ( String[] args ) {
        int size;
        System.out.println ( "����ʵ��." );
        String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";
        HashSet collection = new HashSet ();
        collection.add ( str1 );
        collection.add ( str2 );
        collection.add ( str3 );
        collection.add ( str4 );
        System.out.println ( "��������:" );
        Iterator iterator;
        iterator = collection.iterator ();
        while (iterator.hasNext ()) {
            System.out.print ( iterator.next () + "  " );
        }
        System.out.println ();
        collection.remove ( str3 );
        System.out.println ( "���ڼ�������:" );
        iterator = collection.iterator ();
        while (iterator.hasNext ()) {
            System.out.print ( iterator.next () + "  " );
        }
        System.out.println ();
        size = collection.size ();
        System.out.println ( "���ϳ���:" + size );
    }
}
