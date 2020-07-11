package practice;

public class BinaryTreeByLinkedListMain {

	public static void main(String[] args) {
		BinaryTreeByLinkedList list = new BinaryTreeByLinkedList();
		System.out.println("Inserting values into the Binary tree!\n");
		for (int i = 0; i < 7; i++) {
			list.insert(i + 10);
		}
		System.out.println("Searching for the value in binary tree....\n");
		list.search(10);
		System.out.println("\nDeleting the node from binary tree......\n");
		list.deleteNode(14);
		System.out.println("\nTraversing by inorder traversal....\n");
		list.inOrderTraversal(list.root);
		System.out.println("\nTraversing by preorder traversal....\n");
		list.preOrderTraversal(list.root);
		System.out.println("\nTraversing by postorder traversal.....\n");
		list.postOrderTraversal(list.root);
		System.out.println("\nDeleting the binary tree.......\n");
		list.deleteTree();
	}

}
