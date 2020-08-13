package practice;

import java.util.LinkedList;
import java.util.Queue;

import node.BinaryNode;

public class BinarySearchTree {
	BinaryNode root;

	public BinarySearchTree() {
		root = null;
	}

	public void insertNode(int value) {
		if (root == null) {
			BinaryNode node = createNode(value);
			root = node;
		} else {
			binaryInsert(value, root);
		}
	}

	private BinaryNode createNode(int value) {
		BinaryNode node = new BinaryNode();
		node.setValue(value);
		return node;
	}

	private BinaryNode binaryInsert(int value, BinaryNode currentnode) {
		if (currentnode == null) {
			currentnode = createNode(value);
		} else if (value > currentnode.getValue()) {
			currentnode.setRight(binaryInsert(value, currentnode.getRight()));
		} else {
			currentnode.setLeft(binaryInsert(value, currentnode.getLeft()));
		}
		return currentnode;
	}

	public void searchNode(int value, BinaryNode currentnode) {
		if (currentnode.getValue() == value) {
			System.out.println("The value\t" + value + "\tis found in the tree");
		} else if (value > currentnode.getValue()) {
			searchNode(value, currentnode.getRight());
		} else if (value < currentnode.getValue()) {
			searchNode(value, currentnode.getLeft());
		} else {
			System.out.println("The value\t" + value + "\tis not found in the tree");
		}
	}

	public void deleteNode(int value) {
		if (root == null) {
			System.out.println("Binary search tree is already blank");
		} else {
			System.out.println("Deleting value\t" + value + "\tfrom the binary search tree!");
			delete(value, root);
		}
	}

	private BinaryNode delete(int value, BinaryNode currentnode) {
		if (currentnode == null) {
			System.out.println("Value to be deleted is not found!");
			return null;
		} else if (value > currentnode.getValue()) {
			currentnode.setRight(delete(value, currentnode.getRight()));
		} else if (value < currentnode.getValue()) {
			currentnode.setLeft(delete(value, currentnode.getLeft()));
		} else {
			if (currentnode.getLeft() != null && currentnode.getRight() != null) {
				BinaryNode successor = minimumElementForRight(currentnode.getRight());
				currentnode.setValue(successor.getValue());
				currentnode.setRight(delete(successor.getValue(), currentnode.getRight()));
			} else if (currentnode.getLeft() != null) {
				currentnode = currentnode.getLeft();
			} else if (currentnode.getRight() != null) {
				currentnode = currentnode.getRight();
			} else {
				return null;
			}
		}
		return currentnode;
	}

	private BinaryNode minimumElementForRight(BinaryNode root) {
		if (root.getLeft() == null) {
			return root;
		} else {
			return minimumElementForRight(root.getLeft());
		}
	}

	public void printTreeGraphically() {
		int currentlevel = 1;
		boolean previouslevelwasallnull = false;
		if (root == null) {
			System.out.println("Tree does not exist!");
			return;
		}
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		Queue<Integer> level = new LinkedList<Integer>();
		queue.add(root);
		level.add(1);
		while (!queue.isEmpty()) {
			if (level.peek() == currentlevel) {
				if (queue.peek() == null) {
					queue.add(null);
					level.add(currentlevel + 1);
				} else {
					queue.add(queue.peek().getLeft());
					level.add(currentlevel + 1);
					queue.add(queue.peek().getRight());
					level.add(currentlevel + 1);
					previouslevelwasallnull = false;
				}
				System.out.print(queue.remove() + " ");
				level.remove();
			} else {
				System.out.println("\n");
				currentlevel++;
				if (previouslevelwasallnull == true) {
					break;
				}
				previouslevelwasallnull = true;
			}
		}
	}

	public void deleteTree() {
		System.out.println("Deleting tree.....\n");
		root = null;
		System.out.println("Tree deleted successfully!");
	}
}
