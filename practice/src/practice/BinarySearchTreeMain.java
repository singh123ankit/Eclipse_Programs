package practice;

public class BinarySearchTreeMain {
	public static void main(String args[]) {
		BinarySearchTree obj = new BinarySearchTree();
		System.out.println("Inserting nodes.....\n");
		for (int i = 1; i <= 10; i++) {
			obj.insertNode(i * 10);
		}
		System.out.println("Nodes inserted successfully!\n");
		obj.printTreeGraphically();
		System.out.println("Searching node....\n");
		obj.searchNode(80, obj.root);
		System.out.println("\n");
		System.out.println("deleting node....\n");
		obj.deleteNode(90);
		System.out.println("\n\n");
		obj.deleteTree();
	}

}
