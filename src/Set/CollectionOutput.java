package Set;

import java.util.TreeMap;

public class CollectionOutput {
    public static void main ( String[] args ) {
        System.out.println ( "TreeMapʵ��..." );
        TreeMap treeMap = new TreeMap ();
        treeMap.put ( 1, "Sunday" );
        treeMap.put ( 2, "Monday" );
        treeMap.put ( 3, "Tuesday" );
        treeMap.put ( 4, "Wednesday" );
        treeMap.put ( 5, "Thursday" );
        treeMap.put ( 6, "Friday" );
        treeMap.put ( 7, "Saturday" );
        System.out.println ( "TreeMap��:" + treeMap.keySet () );
        System.out.println ( "TreeMapֵ:" + treeMap.values () );
        System.out.println ( "��Ϊ5ʱ,ֵΪ:" + treeMap.get ( 5 ) );
        Object firstKey = treeMap.firstKey ();
        Object firstValue = treeMap.get ( firstKey );
        System.out.println ( "��һ��ֵ:" + firstKey + ":" + firstValue );
        System.out.println ( "�Ƴ���һ������:" + treeMap.remove ( firstKey ) );
        System.out.println ( "����TreeMap��Ϊ:" + treeMap.keySet () );
        System.out.println ( "����TreeMapֵΪ:" + treeMap.values () );
    }
}
