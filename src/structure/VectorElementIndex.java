package structure;

import java.util.Collections;
import java.util.Vector;

public class VectorElementIndex {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("F");
		v.add("a");
		v.add("D");
		v.add("W");
		v.add("c");
		v.add("H");
		v.add("m");
		v.add("A");
		v.add("R");
		Collections.sort(v);
		System.out.println(v);
		int index = Collections.binarySearch(v, "W");
		System.out.println("W元素的索引值为：" + index);
	}
}
