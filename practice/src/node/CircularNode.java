package node;

public class CircularNode {
	private CircularNode next;
	private CircularNode previous;
	private int data;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data=data;
	}
	public CircularNode getNext() {
		return next;
	}
	public void setNext(CircularNode next) {
		this.next=next;
	}
	public void setPrevious(CircularNode previous) {
		this.previous=previous;
	}
	public CircularNode getPrevious() {
		return previous;
	}
	public String toString() {
		return this.data+"";
	}
}
