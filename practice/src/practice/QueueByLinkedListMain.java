package practice;

public class QueueByLinkedListMain {
	public static void main(String args[]) {
		QueueByLinkedList qu = new QueueByLinkedList();
		for (int i = 0; i < 5; i++) {
			qu.enqueue(i + 7);
		}
		System.out.println("\n");
		System.out.println("Peeking into the Queue..........");
		qu.peek();
		qu.dequeue();
		qu.dequeue();
		System.out.println("\n");
		System.out.println("Peeking into the Queue..........");
		qu.peek();
		System.out.println("\n");
		System.out.println("Deleting Queue.......");
		qu.deleteQueue();
	}
}
