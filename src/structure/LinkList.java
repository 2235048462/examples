package structure;

import java.util.LinkedList;

public class LinkList {
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("1");
		lList.add("4");
		lList.add("6");
		lList.add("4");
		lList.add("3");
		lList.add("4");
		lList.add("9");
		System.out.println("元素4第一次出现的位置" + lList.indexOf("4"));
		System.out.println("元素4最后一次出现的位置" + lList.lastIndexOf("4"));
	}
}
