package structure;

import java.util.Collections;
import java.util.Vector;

public class VectorMaxElement {
	public static void main(String[] args) {
		Vector<Double> vector = new Vector<Double>();
		vector.add(new Double("3.987"));
		vector.add(new Double("1.92"));
		vector.add(new Double("13.24"));
		vector.add(new Double("6.51"));
		vector.add(new Double("7.90"));
		vector.add(new Double("1.43"));
		Object object = Collections.max(vector);
		System.out.println("最大的元素值为 " + object);
	}
}
