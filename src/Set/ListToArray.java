package Set;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main ( String[] args ) {
        List <String> list = new ArrayList <String> ();
        list.add ( "²Ë" );
        list.add ( "Äñ" );
        list.add ( "½Ì" );
        list.add ( "³Ì" );
        list.add ( "www.cctv.com" );
        String[] strings = list.toArray ( new String[0] );
        // System.out.println ( "String[0]:" + new String[0] );
        for (int i = 0; i < strings.length; i++) {
            String contents = strings[i];
            System.out.print ( contents );
        }
    }
}
