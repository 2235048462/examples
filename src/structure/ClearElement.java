package structure;

import java.util.LinkedList;

public class ClearElement {
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("12");
		lList.add("1");
		lList.add("4");
		lList.add("7");
		lList.add("3");
		lList.add("5");
		System.out.println(lList);
		lList.subList(1, 4).clear();
		System.out.println(lList);
	}
}
