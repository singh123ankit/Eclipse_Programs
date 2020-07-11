package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryTreeByArrayMain {

	public static void main(String[] args) throws IOException {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array..");
		n = Integer.parseInt(br.readLine());
		BinaryTreeByArray tree = new BinaryTreeByArray(n);
		System.out.println("Inserting values........\n");
		for (int i = 0; i < 4; i++) {
			tree.insert(i * 10);
		}
		System.out.println("\nTraversing the tree.....\n");
		tree.levelOrderTraversal();
		System.out.println("Searching for the value.....\n");
		tree.search(30);
		System.out.println("Deleting the node.....\n");
		tree.deleteNode(30);
		System.out.println("Traversing by postorder traversal....\n");
		tree.postOrderTraversal(tree.rootindex);
		System.out.println("\nTraversing by inorder traversal...\n");
		tree.inOrderTraversal(tree.rootindex);
		System.out.println("\nTraversing by preorder traversal...\n");
		tree.preOrderTraversal(tree.rootindex);
		System.out.println("\nDeleting the tree......\n");
		tree.deleteTree();
	}

}
