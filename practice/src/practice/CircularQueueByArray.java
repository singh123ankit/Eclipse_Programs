package practice;

public class CircularQueueByArray {
	private int arr[], beginningofqueue, endofqueue;

	public CircularQueueByArray(int size) {
		arr = new int[size];
		beginningofqueue = -1;
		endofqueue = -1;
	}

	public boolean isQueueFull() {
		if (beginningofqueue == 0 && endofqueue == arr.length - 1) {
			return true;
		} else if (endofqueue + 1 == beginningofqueue) {
			return true;
		} else
			return false;
	}

	public boolean isQueueEmpty() {
		if (beginningofqueue == -1) {
			return true;
		} else
			return false;
	}

	public void enqueue(int value) {
		if (arr == null) {
			System.out.println("Create array in order to insert data into the queue!");
		} else if (isQueueFull()) {
			System.out.println("Queue overflow error!!");
		} else {
			initializeBeginningOfQueue();
			if (endofqueue == arr.length - 1) {
				endofqueue = 0;
			} else
				endofqueue++;
			arr[endofqueue] = value;
			System.out.println("The value\t" + value + "\tis enqueued successfully!!");
		}
	}

	public void dequeue() {
		if (isQueueEmpty()) {
			System.out.println("Queue underflow error!!");
		} else {
			System.out.println("Dequeued value\t" + arr[beginningofqueue] + "\tfrom the queue!!");
			arr[beginningofqueue] = 0;
			if (beginningofqueue == endofqueue) {
				beginningofqueue = endofqueue = -1;
			} else if (beginningofqueue == arr.length - 1) {
				beginningofqueue = 0;
			} else
				beginningofqueue++;
		}
	}

	public void peek() {
		if (isQueueEmpty()) {
			System.out.println("Queue underflow error!!!");
		} else {
			System.out.println("The value at the beginning the queue is\t" + arr[beginningofqueue]);
		}
	}

	public void deleteQueue() {
		arr = null;
	}

	public void initializeBeginningOfQueue() {
		if (beginningofqueue == -1) {
			beginningofqueue = 0;
		}
	}
}
