package Set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapAll {
    public static void main ( String[] args ) {
        Map <String, String> maps = new HashMap <> ();
        maps.put ( "1", "PHP" );
        maps.put ( "2", "Java" );
        maps.put ( "3", "C" );
        maps.put ( "4", "C++" );
        maps.put ( "5", "HTML" );

        strongMethod1 ( maps );
        System.out.println ( "----------" );
        strongMethod2 ( maps );
        System.out.println ( "----------" );
        traditionalMethod1 ( maps );
        System.out.println ( "----------" );
        traditionalMethod2 ( maps );
    }

    private static void strongMethod1 ( Map <String, String> maps ) {
        Set <String> set = maps.keySet ();
        for (String s : set) {
            String key = s;
            String value = maps.get ( key );
            System.out.println ( key + ":" + value );
        }
    }

    private static void strongMethod2 ( Map <String, String> maps ) {
        Set <Map.Entry <String, String>> set = maps.entrySet ();
        for (Map.Entry <String, String> e : set) {
            String key = e.getKey ();
            String value = e.getValue ();
            System.out.println ( key + ":" + value );
        }
    }

    private static void traditionalMethod1 ( Map <String, String> maps ) {
        Set <String> set = maps.keySet ();
        Iterator <String> iterator = set.iterator ();
        while (iterator.hasNext ()) {
            String key = iterator.next ();
            String value = maps.get ( key );
            System.out.println ( key + ":" + value );
        }
    }

    private static void traditionalMethod2 ( Map <String, String> maps ) {
        Set <Map.Entry <String, String>> set = maps.entrySet ();
        Iterator <Map.Entry <String, String>> iterator = set.iterator ();
        while (iterator.hasNext ()) {
            Map.Entry <String, String> entry = iterator.next ();
            String key = entry.getKey ();
            String value = entry.getValue ();
            System.out.println ( key + ":" + value );
        }
    }
}
