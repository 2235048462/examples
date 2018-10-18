package Set;

import java.util.TreeMap;

public class CollectionOutput {
    public static void main ( String[] args ) {
        System.out.println ( "TreeMap实例..." );
        TreeMap treeMap = new TreeMap ();
        treeMap.put ( 1, "Sunday" );
        treeMap.put ( 2, "Monday" );
        treeMap.put ( 3, "Tuesday" );
        treeMap.put ( 4, "Wednesday" );
        treeMap.put ( 5, "Thursday" );
        treeMap.put ( 6, "Friday" );
        treeMap.put ( 7, "Saturday" );
        System.out.println ( "TreeMap键:" + treeMap.keySet () );
        System.out.println ( "TreeMap值:" + treeMap.values () );
        System.out.println ( "键为5时,值为:" + treeMap.get ( 5 ) );
        Object firstKey = treeMap.firstKey ();
        Object firstValue = treeMap.get ( firstKey );
        System.out.println ( "第一键值:" + firstKey + ":" + firstValue );
        System.out.println ( "移除第一个数据:" + treeMap.remove ( firstKey ) );
        System.out.println ( "现在TreeMap键为:" + treeMap.keySet () );
        System.out.println ( "现在TreeMap值为:" + treeMap.values () );
    }
}
