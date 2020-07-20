package chapter4;

public class Node {
	private int data;
	private Node nextNode;
	
	public Node(int data) {
		this.data = data;
		this.nextNode = null;
	}
	
	public int getData() {
		return this.data;
	}
	
	public Node getNextNode() {
		return this.nextNode;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	/***
	 * Sets the next node in the linked list 
	 * @param nextNode
	 */
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		return "Data: " + this.data;
	}
	
}
