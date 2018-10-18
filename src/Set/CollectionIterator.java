package Set;

import java.util.*;

public class CollectionIterator {
    public static void main ( String[] args ) {
        listTest ();
        setTest ();
    }

    private static void setTest () {
        Set <String> set = new HashSet <String> ();
        set.add ( "JAVA" );
        set.add ( "C" );
        set.add ( "C++" );
        //����ظ�����ʧ��
        set.add ( "JAVA" );
        set.add ( "JAVASCRIPT" );

        //ʹ��Iterator����set����
        Iterator <String> iterator = set.iterator ();
        while (iterator.hasNext ()) {
            System.out.println ( iterator.next () );
        }
        //ʹ����ǿforѭ������set����
        for (String s : set) {
            System.out.println ( s );
        }
    }

    private static void listTest () {
        List <String> list = new ArrayList <String> ();
        list.add ( "��" );
        list.add ( "��" );
        list.add ( "��" );
        list.add ( "��" );
        list.add ( "www.cctv.com" );

        //ʹ��Iterator����list����
        Iterator <String> iterator = list.iterator ();
        while (iterator.hasNext ()) {

            System.out.println ( iterator.next () );
        }
        //ʹ����ǿforѭ������list����
        for (String s : list) {
            System.out.println ( s );
        }
        //ʹ��forѭ�����б���
        for (int i = 0; i < list.size (); i++) {
            String value = list.get ( i );
            System.out.println ( value );
        }
    }
}
