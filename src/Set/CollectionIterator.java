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
        //添加重复数据失败
        set.add ( "JAVA" );
        set.add ( "JAVASCRIPT" );

        //使用Iterator遍历set集合
        Iterator <String> iterator = set.iterator ();
        while (iterator.hasNext ()) {
            System.out.println ( iterator.next () );
        }
        //使用增强for循环遍历set集合
        for (String s : set) {
            System.out.println ( s );
        }
    }

    private static void listTest () {
        List <String> list = new ArrayList <String> ();
        list.add ( "菜" );
        list.add ( "鸟" );
        list.add ( "教" );
        list.add ( "程" );
        list.add ( "www.cctv.com" );

        //使用Iterator遍历list集合
        Iterator <String> iterator = list.iterator ();
        while (iterator.hasNext ()) {

            System.out.println ( iterator.next () );
        }
        //使用增强for循环遍历list集合
        for (String s : list) {
            System.out.println ( s );
        }
        //使用for循环进行遍历
        for (int i = 0; i < list.size (); i++) {
            String value = list.get ( i );
            System.out.println ( value );
        }
    }
}
