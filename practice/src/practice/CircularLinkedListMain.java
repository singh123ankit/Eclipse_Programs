package practice;

public class CircularLinkedListMain {

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.createCircularLinkedList(20);
		list.insertNode(46, 1);
		list.insertNode(90, 2);
		list.insertNode(89,3);
  	    list.insertNode(4, 4);
  	    System.out.println("Linked list after insertion of nodes....\n");
		list.traverseLinkedList();
		System.out.println("\nDeletion of node.....\n");
		list.deleteNode(2);
		list.traverseLinkedList();
		System.out.println("\nSearching for node.....\n");
		list.searchNode(46);
		System.out.println("\nLinked list after Insertion of node.......\n");
		list.insertNode(50, 5);
		list.traverseLinkedList();
	}

}
