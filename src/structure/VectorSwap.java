package structure;

import java.util.Collections;
import java.util.Vector;

public class VectorSwap {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("1");
		vector.add("w");
		vector.add("s");
		vector.add("4");
		vector.add("2");
		vector.add("b");
		System.out.println(vector);
		Collections.swap(vector, 1, 3);
		System.out.println(vector);
	}
}
