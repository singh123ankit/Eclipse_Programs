package practice;

import node.SingleNode;

public class QueueByLinkedList {
	SingleLinkedList list = new SingleLinkedList();

	public void enqueue(int value) {
		if (list.getHead() == null) {
			list.createSingleLinkedList(value);
			System.out.println("The value\t" + value + "\tis inserted successfully!");
		} else {
			list.insertLinkedList(value, list.getSize());
			System.out.println("The value\t" + value + "\tis inserted successfully!");
		}
	}

	public boolean isQueueEmpty() {
		if (list.getHead() == null)
			return true;
		else
			return false;
	}

	public void dequeue() {
		SingleNode temp = list.getHead();
		if (isQueueEmpty()) {
			System.out.println("Queue underflow error!");
		} else {
			System.out.println("The value\t" + temp.getData() + "\tis removed successfully!");
			list.deleteNode(0);
		}
	}

	public void peek() {
		SingleNode temp = list.getHead();
		System.out.println("Value at the top of the Queue=\t" + temp.getData());
	}

	public void deleteQueue() {
		list.deleteLinkedList();
		System.out.println("Deleted Queue successfully!");
	}
}
