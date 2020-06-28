package practice;

public class CircularSingleLinkedListMain {

	public static void main(String[] args) {
		CircularSingleLinkedList list = new CircularSingleLinkedList();
		list.createLinkedList(20);
		list.insertLinkedList(46, 1);
		list.insertLinkedList(90, 2);
		list.insertLinkedList(89,3);
  	    list.insertLinkedList(4, 5);
  	    System.out.println("Linked list after insertion of nodes....\n");
		list.traverseLinkedList();
		System.out.println("\nDeletion of node.....\n");
		list.deleteNode(0);
		list.traverseLinkedList();
		System.out.println("\nSearching for node.....\n");
		list.searchNode(90);
	}

}
