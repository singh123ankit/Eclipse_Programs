package practice;

import java.util.LinkedList;
import java.util.Queue;

import node.BinaryNode;

public class BinaryTreeByLinkedList {
	BinaryNode root;

	public BinaryTreeByLinkedList() {
		this.root = null;
	}

	public void insert(int value) {
		BinaryNode node = new BinaryNode();
		node.setValue(value);
		if (root == null) {
			root = node;
			System.out.println("Value\t" + value + "\tis inserted successfully!");
			return;
		}
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentnode = queue.remove();
			if (presentnode.getLeft() == null) {
				presentnode.setLeft(node);
				System.out.println("Value\t" + value + "\tis inserted successfully!");
				break;
			} else if (presentnode.getRight() == null) {
				presentnode.setRight(node);
				System.out.println("Value\t" + value + "\tis inserted successfully!");
				break;
			} else {
				queue.add(presentnode.getLeft());
				queue.add(presentnode.getRight());
			}
		}
	}

	public void search(int value) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentnode = queue.remove();
			if (presentnode.getValue() == value) {
				System.out.println("Value is found successfully in binary tree!");
				return;
			} else if (presentnode.getLeft() != null) {
				queue.add(presentnode.getLeft());
			} else if (presentnode.getRight() != null) {
				queue.add(presentnode.getRight());
			}
		}
		System.out.println("Value is not found in binary tree!");
	}

	public BinaryNode getDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode presentnode = null;
		while (!queue.isEmpty()) {
			presentnode = queue.remove();
			if (presentnode.getLeft() != null) {
				queue.add(presentnode.getLeft());
			}
			if (presentnode.getRight() != null) {
				queue.add(presentnode.getRight());
			}
		}
		return presentnode;
	}

	public void deleteDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode presentnode = null;
		BinaryNode previousnode = null;
		while (!queue.isEmpty()) {
			previousnode = presentnode;
			presentnode = queue.remove();
			if (presentnode.getLeft() == null) {
				previousnode.setRight(null);
			} else if (presentnode.getRight() == null) {
				presentnode.setLeft(null);
			} else {
				queue.add(presentnode.getLeft());
				queue.add(presentnode.getRight());
			}
		}
	}

	public void deleteNode(int value) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentnode = queue.remove();
			if (presentnode.getValue() == value) {
				presentnode.setValue(getDeepestNode().getValue());
				deleteDeepestNode();
				System.out.println("Deleted node successfully in binary tree!\n");
				return;
			}
			if (presentnode.getLeft() != null) {
				queue.add(presentnode.getLeft());
			}
			if (presentnode.getRight() != null) {
				queue.add(presentnode.getRight());
			}
		}
	}

	public void deleteTree() {
		root = null;
		System.out.println("Binary tree is deleted successfully!");
	}

	public void preOrderTraversal(BinaryNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.getValue() + " ");
		preOrderTraversal(node.getLeft());
		preOrderTraversal(node.getRight());
	}

	public void inOrderTraversal(BinaryNode node) {
		if (node == null) {
			return;
		}
		inOrderTraversal(node.getLeft());
		System.out.print(node.getValue() + " ");
		inOrderTraversal(node.getRight());
	}

	public void postOrderTraversal(BinaryNode node) {
		if (node == null) {
			return;
		}
		postOrderTraversal(node.getLeft());
		postOrderTraversal(node.getRight());
		System.out.print(node.getValue() + " ");
	}

	public void levelOrderTraversal() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentnode = queue.remove();
			System.out.print(presentnode.getValue() + " ");
			if (presentnode.getLeft() != null) {
				queue.add(presentnode.getLeft());
			}
			if (presentnode.getRight() != null) {
				queue.add(presentnode.getRight());
			}
		}
	}
}
