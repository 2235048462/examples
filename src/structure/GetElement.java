package structure;

import java.util.*;

public class GetElement {
	private LinkedList<Object> lList = new LinkedList<Object>();

	public static void main(String[] args) {
		GetElement stack = new GetElement();
		for (int i = 10; i < 45; i++) {
			stack.push(new Integer(i));
		}

		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

	public void push(Object v) {
		lList.addFirst(v);
	}

	public Object top() {
		return lList.getFirst();
	}

	public Object pop() {
		return lList.removeFirst();
	}
}
