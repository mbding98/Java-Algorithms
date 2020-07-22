package chapter4;

public class DoublyNode {
	private int data;
	private DoublyNode prevNode, nextNode;
	
	public DoublyNode(int data) {
		this.data = data;
		this.nextNode = null;
		this.prevNode = null;
	}
	
	public int getData() {
		return this.data;
	}
	
	public DoublyNode getNextNode() {
		return this.nextNode;
	}
	
	public DoublyNode getPrevNode() {
		return this.prevNode;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNextNode(DoublyNode nextNode) {
		this.nextNode = nextNode;
	}

	public void setPrevnode(DoublyNode prevNode) {
		this.prevNode = prevNode;
	}
}
