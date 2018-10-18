package Set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class CollectionComparison {
    public static void main ( String[] args ) {
        String[] coins = {"Penny", "nickel", "dime", "Quarter", "dollar"};
        Set <String> set = new TreeSet <String> ();
        for (int i = 0; i < coins.length; i++) {
            set.add ( coins[i] );
        }
        System.out.println ( Collections.min ( set ) );
        System.out.println ( Collections.min ( set, String.CASE_INSENSITIVE_ORDER ) );
        System.out.println ( "------------" );
        System.out.println ( Collections.max ( set ) );
        System.out.println ( Collections.max ( set, String.CASE_INSENSITIVE_ORDER ) );
    }
}
