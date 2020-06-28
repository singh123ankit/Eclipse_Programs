package practice;
import node.CircularNode;
public class CircularLinkedList {
	private CircularNode head;
	private CircularNode tail;
	private int size;
	public void createCircularLinkedList(int data) {
		CircularNode node = new CircularNode();
		node.setData(data);
		node.setNext(null);
		node.setPrevious(null);
		head=node;
		tail=node;
		size=1;
	}
	public boolean existsLinkedList() {
		return head!=null;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size=size;
	}
	public void insertNode(int value,int loc) {
		CircularNode node = new CircularNode();
		node.setData(value);
		if(loc==0) {
			node.setNext(head);
			node.setPrevious(null);
			head.setPrevious(node);
			head=node;
			setSize(getSize()+1);
		}
		else if(loc>=getSize()-1) {
			node.setNext(null);
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
			node.setNext(tempnode.getNext());
			CircularNode nextnode=tempnode.getNext();
			nextnode.setPrevious(node);
			tempnode.setNext(node);
			setSize(getSize()+1);
		}
	}
	public void traverseLinkedList() {
		if(!existsLinkedList()) {
			System.out.println("Linked list does not exist");
			return;
		}
		CircularNode tempnode=head;
		for(int i=0;i<getSize();i++) {
			System.out.print(tempnode.getData());
			if(tempnode.getNext()!=null) {
				System.out.print("->");
			}
			else {
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
				setSize(getSize()-1);
			}
			else if(loc==getSize()-1) {
				tail=tail.getPrevious();
				tail.setNext(null);
				setSize(getSize()-1);
			}
			else {
				CircularNode tempnode=head;
				for(int i=0;i<loc-1;i++) {
					tempnode=tempnode.getNext();
				}
				CircularNode nextnode=tempnode.getNext();
				tempnode.setNext(nextnode.getNext());
				nextnode=nextnode.getNext();
				nextnode.setPrevious(tempnode);
				setSize(getSize()-1);
			}
		}
		else {
			System.out.println("Location value is out of index");
			return;
		}
	}
	public void searchNode(int value) {
		CircularNode tempnode=head;
		for(int i=0;i<getSize();i++) {
			if(tempnode.getData()==value) {
				System.out.println("The value\t"+value+"is found at location\t"+i);
				return;
			}
			if(tempnode.getNext()!=null) {
				tempnode=tempnode.getNext();
			}
			else {
				System.out.println("Value not found");
				return;
			}
		}
	}
}
