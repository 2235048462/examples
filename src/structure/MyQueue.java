package structure;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		// ���Ԫ��
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		queue.offer("4");
		queue.offer("5");
		queue.offer("6");
		// ������������
		for (String q : queue) {
			System.out.print(q + " ");
		}
		System.out.println();
		System.out.println("ɾ��" + queue.poll());
		for (String q : queue) {
			System.out.print(q + " ");
		}
		System.out.println();
		System.out.println("��Ԫ��" + queue.element());
		System.out.println("��Ԫ��" + queue.peek());
	}
}
