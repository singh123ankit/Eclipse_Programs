package practice;

public class DoubleCircularLinkedListMain {

	public static void main(String[] args) {
		DoubleCircularLinkedList list = new DoubleCircularLinkedList();
		list.createNode(20);
		list.insertNode(46, 1);
		list.insertNode(90, 2);
		list.insertNode(89,3);
  	    list.insertNode(4, 4);
  	    System.out.println("Linked list after insertion of nodes....\n");
		list.traverseNode();
		System.out.println("\nDeletion of node.....\n");
		list.deleteNode(2);
		list.traverseNode();
		System.out.println("\nSearching for node.....\n");
		list.searchNode(46);
		System.out.println("\nLinked list after Insertion of node.......\n");
		list.insertNode(50, 5);
		list.traverseNode();
	}

}
