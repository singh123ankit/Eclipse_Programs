package practice;

public class StackByLinkedListMain {

	public static void main(String[] args) {
		StackByLinkedList list = new StackByLinkedList();
		System.out.println("Pushing 6 values in the Stack...");
		for (int i = 0; i <= 5; i++) {
			list.push(i * 10);
		}

		System.out.println("Peeking value from stack");
		list.peekOperation();

		System.out.println("Poping 6 values from the Stack...");
		for (int i = 0; i <= 5; i++) {
			list.pop();
		}

		System.out.println("Deleting the Stack...");
		list.deleteStack();
		System.out.println("Stack successfully deleted!");

	}

}
