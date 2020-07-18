package chapter4;

public class Node {
	private int data;
	private Node nextNode;
	
	public Node(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public Node getNode() {
		return this.nextNode;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
}
