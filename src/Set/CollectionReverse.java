package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class CollectionReverse {
    public static void main ( String[] args ) {
        String[] coins = {"A", "B", "C", "D", "E"};
        List <String> list = new ArrayList ();
        for (int i = 0; i < coins.length; i++) {
            list.add ( coins[i] );
        }
        ListIterator listIterator = list.listIterator ();
        System.out.println ( "��תǰ:" );
        while (listIterator.hasNext ()) {
            System.out.print ( listIterator.next () );
        }
        System.out.println ();
        Collections.reverse ( list );
        listIterator = list.listIterator ();
        System.out.println ( "��ת��:" );
        while (listIterator.hasNext ()) {
            System.out.print ( listIterator.next () );
        }
    }
}
