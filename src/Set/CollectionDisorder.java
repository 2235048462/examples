package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDisorder {
    public static void main ( String[] args ) {
        List <Integer> list = new ArrayList <Integer> ();
        for (int i = 0; i < 10; i++) {
            list.add ( new Integer ( i ) );
        }
        System.out.println ( "����ǰ:" );
        System.out.println ( list );
        for (int i = 0; i < 6; i++) {
            System.out.println ( "��" + i + "�δ���:" );
            Collections.shuffle ( list );
            System.out.println ( list );
        }
    }
}
