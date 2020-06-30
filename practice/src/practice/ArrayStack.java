package practice;

public class ArrayStack {
	int topofstack;
	int arr[];

	public ArrayStack(int size) {
		this.topofstack = -1;
		this.arr = new int[size];
	}

	public boolean isStackFull() {
		if (topofstack == arr.length - 1) {
			return true;
		} else
			return false;
	}

	public boolean isStackEmpty() {
		if (topofstack == -1) {
			return true;
		} else
			return false;
	}

	public void push(int value) {
		if (isStackFull()) {
			System.out.println("Stack is overflow");
			return;
		}
		topofstack++;
		arr[topofstack] = value;
		System.out.println("The value\t" + value + "\t is successfully inserted.");
	}

	public void pop() {
		if (isStackEmpty()) {
			System.out.println("Stack is empty");
			return;
		} else
			System.out.println("The value\t" + arr[topofstack] + "\tis successfully poped out.");
		topofstack--;
	}

	public void peek() {
		if (isStackEmpty()) {
			System.out.println("Stack is empty.");
			return;
		} else
			System.out.println("Top of Stack value=\t" + arr[topofstack]);

	}

	public void deleteStack() {
		arr = null;
		System.out.println("Stack is successfully deleted!");
	}
}
