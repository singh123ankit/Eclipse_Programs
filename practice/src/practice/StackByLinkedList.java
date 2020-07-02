package practice;

import node.SingleNode;

public class StackByLinkedList {
	SingleLinkedList list;

	public StackByLinkedList() {
		list = new SingleLinkedList();
	}

	public void push(int value) {
		if (list.getHead() == null) {
			list.createSingleLinkedList(value);
		} else {
			list.insertLinkedList(value, 0);
		}
		System.out.println("The value\t" + value + "\tis pushed successfully!");
	}

	public void pop() {
		SingleNode access = list.getHead();
		if (list.getHead() == null) {
			System.out.println("Stack is empty!");
		} else {
			System.out.println("The value\t" + access.getData() + "\tis poped out successfully!");
			access = null;
			list.deleteNode(0);
		}
	}

	public void peekOperation() {
		SingleNode access = list.getHead();
		if (list.getHead() == null) {
			System.out.println("Stack is empty!");
		} else {
			System.out.println("The value\t" + access.getData() + "\tis at the top of the stack.");
		}
	}

	public void deleteStack() {
		list.deleteLinkedList();
	}

}
