package practice;

public class LinearQueueByArray {
	private int arr[], beginningofqueue, endofqueue;

	public LinearQueueByArray(int size) {
		arr = new int[size];
		beginningofqueue = -1;
		endofqueue = -1;
	}

	public boolean isQueueFull() {
		if (endofqueue == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isQueueEmpty() {
		if (beginningofqueue == -1) {
			return true;
		} else {
			return false;
		}
	}

	public void enqueue(int value) {
		if (isQueueFull()) {
			System.out.println("Queue is full.Queue overflow error!");
			return;
		}
		endofqueue++;
		if (beginningofqueue == -1) {
			beginningofqueue = 0;
		}
		arr[endofqueue] = value;
		System.out.println("The value\t" + value + "\tis enqueed successfully!");
	}

	public void dequeue() {
		if (isQueueEmpty()) {
			System.out.println("Queue is empty.Queue underflow error!");
			return;
		}
		System.out.println("The value\t" + arr[beginningofqueue] + "\tis removed successfully.");
		arr[beginningofqueue] = 0;
		if (beginningofqueue == endofqueue) {
			beginningofqueue = endofqueue = -1;
		} else
			beginningofqueue++;
	}

	public void peek() {
		if (isQueueEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.println("The value at the beginning of the queue is\t" + arr[beginningofqueue]);
	}

	public void deleteQueue() {
		arr = null;
	}

}
