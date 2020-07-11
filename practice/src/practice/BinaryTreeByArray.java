package practice;

public class BinaryTreeByArray {
	int arr[];
	int lastusedindex;
	int rootindex;

	public BinaryTreeByArray(int size) {
		arr = new int[size];
		lastusedindex = 0;
		rootindex = 1;
	}

	public boolean isFull() {
		if (lastusedindex == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void insert(int value) {
		if (isFull()) {
			System.out.println("Tree is full.No more values can be inserted in the tree!\n");
			return;
		} else {
			arr[lastusedindex + 1] = value;
			lastusedindex++;
			System.out.println("The value\t" + value + "\tis inserted successfuly in the tree!\n");
		}
	}

	public int search(int value) {
		for (int i = 1; i <= lastusedindex; i++) {
			if (arr[i] == value) {
				System.out.println("The value\t" + value + "\tis found successfully!\n");
				return i;
			}
		}
		return -1;
	}

	public void deleteNode(int value) {
		int loc = search(value);
		if (loc == -1) {
			System.out.println("Value to be deleted is not found in the tree!\n");
		} else {
			arr[loc] = arr[lastusedindex];
			lastusedindex--;
			System.out.println("Value is deleted successfully!\n");
		}
	}

	public void preOrderTraversal(int index) {
		if (index > lastusedindex) {
			return;
		}
		System.out.print(arr[index] + " ");
		preOrderTraversal(index * 2);
		preOrderTraversal(index * 2 + 1);
	}

	public void inOrderTraversal(int index) {
		if (index > lastusedindex) {
			return;
		}
		inOrderTraversal(index * 2);
		System.out.print(arr[index] + " ");
		inOrderTraversal(index * 2 + 1);
	}

	public void postOrderTraversal(int index) {
		if (index > lastusedindex) {
			return;
		}
		postOrderTraversal(index * 2);
		postOrderTraversal(index * 2 + 1);
		System.out.print(arr[index] + " ");
	}

	public void levelOrderTraversal() {
		for (int i = 1; i <= lastusedindex; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void deleteTree() {
		arr = null;
		System.out.println("Tree deleted successfully!\n");
	}
}
