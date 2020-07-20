package chapter4;

public class LinkedList {
	private Node head;
	
	public void insertAtHead(int data) {
		Node node = new Node(data);
		node.setNextNode(this.head);
		this.head = node;
	}
	
	public void deleteFromHead() {
		this.head = this.head.getNextNode();
	}
	
	public Node search(int data) {
		Node current = this.head;
		
		while(current != null) {
			if (current.getData() == data)
				return current;
			
			current = current.getNextNode();
		}
		return null;
	}
	
	public int length() {
		int length = 0;
		Node current = this.head;
		
		while(current != null) {
			length++;
			current = current.getNextNode();
		}
		return length;
	}
	
	@Override
	public String toString() {
		String result = "{";
		Node current =  this.head;
		
		while (current != null) {
			result += current.toString()+',';
			current = current.getNextNode();
		}
		return result + "}";
	}
}
