package practice;
import node.CircularNode;
public class DoubleCircularLinkedList {
	private CircularNode head;
	private CircularNode tail;
	private int size;
	public void createNode(int data) {
		CircularNode node = new CircularNode();
		node.setPrevious(null);
		node.setData(data);
		node.setNext(node);
		head=node;
		tail=node;
		size=1;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size=size;
	}
	public boolean existsLinkedList() {
		return head!=null;
	}
	public void insertNode(int value,int loc) {
		CircularNode node= new CircularNode();
		node.setData(value);
		if(!existsLinkedList()) {
			System.out.println("Linked list does not exist");
			return;
		}
		else if(loc==0) {
			node.setNext(head);
			node.setPrevious(null);
			head=node;
			tail.setNext(node);
			setSize(getSize()+1);
		}
		else if(loc>=getSize()-1) {
			node.setNext(head);
			node.setPrevious(tail);
			tail.setNext(node);
			tail=node;
			setSize(getSize()+1);
		}
		else {
			CircularNode tempnode=head;
			for(int i=0;i<loc-1;i++) {
				tempnode=tempnode.getNext();
			}
			node.setPrevious(tempnode);
			CircularNode nextnode=tempnode.getNext();
			node.setNext(nextnode);
			tempnode.setNext(node);
			nextnode.setPrevious(node);
			setSize(getSize()+1);
		}
	}
	
	public void traverseNode() {
		CircularNode tempnode=head;
		if(!existsLinkedList()) {
			System.out.println("Linked list does not exist");
			return;
		}
		for(int i=0;i<getSize();i++) {
			System.out.print(tempnode.getData());
			if(tempnode.getNext()!=head){
				System.out.print("->");
			}
			if(tempnode.getNext()==head) {
				return;
			}
			tempnode=tempnode.getNext();
		}
	}
	public void deleteNode(int loc) {
		if(!existsLinkedList()) {
			System.out.println("Linked list does not exist");
			return;
		}
		if(loc<=getSize()-1) {
			if(loc==0) {
				head=head.getNext();
				head.setPrevious(null);
				tail.setNext(head);
				setSize(getSize()-1);
			}
			else if(loc==getSize()-1) {
				tail=tail.getPrevious();
				tail.setNext(head);
				setSize(getSize()-1);
			}
			else {
				CircularNode tempnode=head;
				for(int i=0;i<loc-1;i++) {
					tempnode=tempnode.getNext();
				}
				CircularNode nextnode=tempnode.getNext();
				nextnode=nextnode.getNext();
				nextnode.setPrevious(tempnode);
				tempnode.setNext(nextnode);
				setSize(getSize()-1);
		}
	}
		else {
			System.out.println("Location value is out of index");
			return;
		}
	}
	public void searchNode(int value) {
		if(!existsLinkedList()) {
			System.out.println("Linked list does not exist");
			return;
		}
		CircularNode tempnode=head;
		for(int i=0;i<getSize()-1;i++) {
			if(tempnode.getData()==value) {
				System.out.println("Location of value\t"+value+"\tis found at\t"+i);
				return;
			}
			tempnode=tempnode.getNext();
		}
		if(tempnode.getNext()==head) {
			System.out.println("Value not found");
			return;
		}
	}
}
