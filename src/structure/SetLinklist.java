package structure;

import java.util.LinkedList;

public class SetLinklist {
	public static void main(String[] args) {
		LinkedList<String> officers = new LinkedList<String>();
		officers.add("E");
		officers.add("E");
		officers.add("C");
		officers.add("S");
		officers.add("U");
		officers.add("S");
		System.out.println(officers);
		officers.set(3, "K");
		System.out.println(officers);
	}
}
