package structure;

import java.util.LinkedList;

public class GetFirst {

	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("100");
		lList.add("200");
		lList.add("300");
		lList.add("400");
		System.out.println("��һ��Ԫ�أ�" + lList.getFirst());
		System.out.println("���һ��Ԫ�أ�" + lList.getLast());
	}
}
