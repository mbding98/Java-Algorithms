package chapter4;

public class DoublyLinkedList {
	private DoublyNode head;
	
	public void insertAtHead(int data) {
		DoublyNode newNode = new DoublyNode (data);
		newNode.setNextNode(this.head);
		
		if(this.head != null)
			this.head.setPrevnode(newNode);
		
		this.head = newNode;
	}
	
	public int length() {
		int length = 0;
		DoublyNode current = this.head;
		
		while(current != null) {
			length++;
			current = current.getNextNode();
		}
		return length;
	}

	@Override
	public String toString() {
		String result = "{";
		DoublyNode current =  this.head;
		
		while (current != null) {
			result += current.toString()+',';
			current = current.getNextNode();
		}
		return result + "}";
	}
}
