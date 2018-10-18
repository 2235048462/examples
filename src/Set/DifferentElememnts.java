package Set;

import java.util.*;

public class DifferentElememnts {
    public static void main ( String[] args ) {
        List lnkList = new LinkedList ();
        lnkList.add ( "element1" );
        lnkList.add ( "element2" );
        lnkList.add ( "element13" );
        lnkList.add ( "element4" );
        displayAll ( lnkList );
        List aryList = new ArrayList ();
        aryList.add ( "w" );
        aryList.add ( "x" );
        aryList.add ( "y" );
        aryList.add ( "z" );
        displayAll ( aryList );
        Set hashSet = new HashSet ();
        hashSet.add ( "set1" );
        hashSet.add ( "set2" );
        hashSet.add ( "set3" );
        hashSet.add ( "set4" );
        displayAll ( hashSet );
        SortedSet treeSet = new TreeSet ();
        treeSet.add ( "1" );
        treeSet.add ( "2" );
        treeSet.add ( "3" );
        treeSet.add ( "4" );
        displayAll ( treeSet );
        LinkedHashSet lnkHashset = new LinkedHashSet ();
        lnkHashset.add ( "one" );
        lnkHashset.add ( "two" );
        lnkHashset.add ( "three" );
        lnkHashset.add ( "four" );
        displayAll ( lnkHashset );
        Map map1 = new HashMap ();
        map1.put ( "key1", "J" );
        map1.put ( "key2", "K" );
        map1.put ( "key3", "L" );
        map1.put ( "key4", "M" );
        displayAll ( map1.keySet () );
        displayAll ( map1.values () );
        SortedMap map2 = new TreeMap ();
        map2.put ( "key1", "JJ" );
        map2.put ( "key2", "KK" );
        map2.put ( "key3", "LL" );
        map2.put ( "key4", "MM" );
        displayAll ( map2.keySet () );
        displayAll ( map2.values () );
        LinkedHashMap map3 = new LinkedHashMap ();
        map3.put ( "key1", "JJJ" );
        map3.put ( "key2", "KKK" );
        map3.put ( "key3", "LLL" );
        map3.put ( "key4", "MMM" );
        displayAll ( map3.keySet () );
        displayAll ( map3.values () );
    }

    static void displayAll ( Collection collection ) {
        Iterator iterator = collection.iterator ();
        while (iterator.hasNext ()) {
            String string = (String) iterator.next ();
            System.out.print ( string + " " );
        }
        System.out.println ();
    }
}
