package structure;

import java.io.IOException;

public class ReverserStack {
	private String input;
	private String output;

	public ReverserStack(String in) {
		input = in;
	}

	public static void main(String[] args) throws IOException {
		String input = "cctv.com";
		String output;
		ReverserStack theReverserStack = new ReverserStack(input);
		output = theReverserStack.doReverser();
		System.out.println("反转前：" + input);
		System.out.println("反转后：" + output);
	}

	public String doReverser() {
		output = "";
		int stackSize = input.length();
		Stack stack = new Stack(stackSize);
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			stack.push(ch);
		}
		while (!stack.isEmpty()) {
			char ch = stack.pop();
			output = output + ch;
		}
		return output;
	}

	class Stack {
		private int maxSize;
		private char[] stackArray;
		private int top;

		public Stack(int max) {
			maxSize = max;
			stackArray = new char[maxSize];
			top = -1;
		}

		public void push(char j) {
			stackArray[++top] = j;
		}

		public char pop() {
			return stackArray[top--];
		}

		public char peek() {
			return stackArray[top];
		}

		public boolean isEmpty() {
			return (top == -1);
		}

		public boolean isFull() {
			return (top == maxSize - 1);
		}
	}
}
