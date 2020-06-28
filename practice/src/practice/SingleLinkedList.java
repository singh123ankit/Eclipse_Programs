package practice;
import node.SingleNode;
public class SingleLinkedList {
	private SingleNode head=null;
	private SingleNode tail=null;
	private int size;
	public void createSingleLinkedList(int data) {
		SingleNode node = new SingleNode();
		node.setData(data);
		node.setNext(null);
		head=node;
		tail=node;
		size=1;
	}
	public boolean existsLinkedList() {
		return head!=null;
	}
	public void setSize(int size) {
		this.size=size;
	}
	public int getSize() {
		return size;
	}
	public void insertLinkedList(int value,int loc) {
		SingleNode node = new SingleNode();
		node.setData(value);
		if(existsLinkedList()) {
			if(loc==0) {
				node.setNext(head);
				head=node;
				setSize(getSize()+1);
			}
			else if(loc>=getSize()-1) {
				tail.setNext(node);
				node.setNext(null);
				tail=node;
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
		else {
			System.out.println("Linked list does not exist");
			return;
		}
	}
	public void traverseLinkedList() {
		if(existsLinkedList()) {
		SingleNode tempnode=head;
		for(int i=0;i<getSize();i++) {
			System.out.print(tempnode.getData());
			if(tempnode.getNext()!=null) {
				System.out.print("->");
			}
			if(tempnode.getNext()!=null) {
				tempnode=tempnode.getNext();
			}
			else {
				return;
			}
			}
		}
		else {
			System.out.println("Linked List does not exist");
			return;
		}
	}
	public void deleteNode(int loc) {
		SingleNode tempnode=head;
		if(!existsLinkedList()) {
			System.out.println("Linked list does not exist");
			return;
		}
		else if(loc==0) {
			head=head.getNext();
			setSize(getSize()-1);
			if(getSize()==0) {
				tail=null;
			}
		}
		else if(loc==getSize()-1) {
			for(int i=0;i<getSize()-2;i++) {
				tempnode=tempnode.getNext();
			}
			tail=tempnode;
			tempnode.setNext(null);
			setSize(getSize()-1);
			
		}
		else {
			if(loc>getSize()-1) {
				System.out.println("Index out of range!Please give location within the size of linked list.");
				return;
			}
			for(int i=0;i<loc-1;i++) {
				tempnode=tempnode.getNext();
			}
			SingleNode nextnode=tempnode.getNext();
			tempnode.setNext(nextnode.getNext());
			setSize(getSize()-1);
			
		}
	}
	public void deleteLinkedList() {
		head=null;
		tail=null;
	}
	public void searchLinkedList(int value) {
		if(!existsLinkedList()) {
			System.out.println("Linked list does not exist.");
			return;
		}
		SingleNode tempnode=head;
		for(int i=0;i<getSize()-1;i++) {
			if(tempnode.getData()==value) {
				System.out.println("The value\t"+value+"\tis found at location\t"+i);
				return;
			}
			tempnode=tempnode.getNext();
		}
		System.out.println("The value is not found");
	}
	public void swapLinkedList(int loc1,int loc2) {
		if(!existsLinkedList()) {
			System.out.println("Linked list does not exist");
			return;
		}
		SingleNode tempnode1=head;
		SingleNode tempnode2=head;
		for(int i=0;i<loc1;i++) {
			tempnode1=tempnode1.getNext();
		}
		for(int j=0;j<loc2;j++) {
			tempnode2=tempnode2.getNext();
		}
		int temp=tempnode1.getData();
		tempnode1.setData(tempnode2.getData());
		tempnode2.setData(temp);
	}
}
