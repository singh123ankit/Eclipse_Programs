package practice;

public class SingleLinkedListMain {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.createSingleLinkedList(20);
		list.insertLinkedList(46, 1);
		list.insertLinkedList(90, 2);
		list.insertLinkedList(89,3);
  	    list.insertLinkedList(4, 4);
  	    System.out.println("Linked list after insertion of nodes....\n");
		list.traverseLinkedList();
		System.out.println("\nDeletion of node.....\n");
		list.deleteNode(2);
		list.traverseLinkedList();
		System.out.println("\nSearching for node.....\n");
		list.searchLinkedList(46);
		System.out.println("\nSwapping of node......\n");
		list.swapLinkedList(1, 2);
		list.traverseLinkedList();
		System.out.println("\nLinked list after Insertion of node.......\n");
		list.insertLinkedList(50, 5);
		list.traverseLinkedList();
	}

}
