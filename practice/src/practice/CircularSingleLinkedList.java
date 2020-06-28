package practice;
import node.SingleNode;
public class CircularSingleLinkedList {
	private SingleNode head;
	private SingleNode tail;
	private int size;
	public void createLinkedList(int data) {
		SingleNode node = new SingleNode();
		node.setData(data);
		node.setNext(node);
		head=node;
		tail=node;
		size=1;
	}
	public void setSize(int value) {
		size=value;
	}
	public int getSize() {
		return size;
	}
	public boolean existsLinkedList() {
		return head!=null;
	}
	public void insertLinkedList(int data,int loc) {
		SingleNode node = new SingleNode();
		node.setData(data);
		if(loc==0) {
			node.setNext(head);
			head=node;
			tail.setNext(head);
			setSize(getSize()+1);
		}
		else if(loc>=getSize()-1) {
			tail.setNext(node);
			tail=node;
			node.setNext(head);
			setSize(getSize()+1);
		}
		else {
			SingleNode tempnode=head;
			for(int i=0;i<loc-1;i++) {
				tempnode=tempnode.getNext();
			}
			node.setNext(tempnode.getNext());
			tempnode.setNext(node);
			setSize(getSize()+1);
		}
	}
	public void traverseLinkedList() {
		SingleNode tempnode=head;
		if(!existsLinkedList()) {
			System.out.println("Linked list does not exist");
			return;
		}
		for(int i=0;i<getSize();i++) {
			System.out.print(tempnode.getData());
			if(tempnode.getNext()!=head) {
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
		if(loc>getSize()-1) {
			System.out.println("Index value is not within the size of linked list");
			return;
		}
		else if(loc==0) {
			if(head.getNext()==head) {
				head=null;
				tail=null;
				setSize(getSize()-1);
				return;
			}
			head=head.getNext();
			tail.setNext(head);
			tail=head;
			setSize(getSize()-1);
		}
		else if(loc==getSize()-1) {
			SingleNode tempnode=head;
			for(int i=0;i<getSize()-2;i++) {
				tempnode=tempnode.getNext();
			}
			tail=tempnode;
			tempnode.setNext(head);
			setSize(getSize()-1);
		}
		else {
				SingleNode tempnode=head;
				for(int i=0;i<loc-1;i++) {
					tempnode=tempnode.getNext();
				}
				SingleNode nextnode=head;
				for(int j=0;j<loc;j++) {
					nextnode=nextnode.getNext();
				}
				tempnode.setNext(nextnode.getNext());
				setSize(getSize()-1);
			}
	}
	public void searchNode(int value) {
		SingleNode tempnode=head;
		for(int i=0;i<getSize()-1;i++) {
			if(tempnode.getData()==value) {
				System.out.println("The location of value\t"+value+"\tis found at\t"+(i+1));
				return;
			}
			tempnode=tempnode.getNext();
		}
		System.out.println("The value is not found");
	}
	public void deleteLinkedList() {
		tail.setNext(null);
		head=null;
		tail=null;
	}
}
