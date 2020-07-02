package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircularQueueByArrayMain {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the size of array");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		CircularQueueByArray qu = new CircularQueueByArray(size);
		System.out.println("Inserting values into the queue.........\n\n");
		for (int i = 0; i < 6; i++) {
			qu.enqueue(i * 11);
		}
		System.out.println("\n");
		System.out.println("Peeking into the Queue...\n");
		qu.peek();
		System.out.println("\n");
		System.out.println("Removing data from the queue.....\n\n");
		for (int i = 0; i < 4; i++) {
			qu.dequeue();
		}
		System.out.println("\n");
		qu.enqueue(79);
		qu.enqueue(99);
		System.out.println("\n");
		System.out.println("Peeking into the Queue...\n");
		qu.peek();
		System.out.println("\n");
		System.out.println("Deleting the queue....\n\n");
		qu.deleteQueue();
		System.out.println("Queue deleted successfully!");
	}

}
