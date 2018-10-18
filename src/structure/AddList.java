package structure;

public class AddList {
	public static void main(String[] args) {
		java.util.LinkedList<String> lList = new java.util.LinkedList<String>();
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");
		lList.add("6");
		System.out.println(lList);
		lList.addFirst("0");
		System.out.println(lList);
		lList.addLast("7");
		System.out.println(lList);
	}	
}
