package chapter4;

public class DoublyEndedList {
	private Node head, tail;
	
	public void insertAtTail(int data) {
		Node newNode = new Node(data);
		
		// if head==null, newNode is the head
		if(this.head == null) 
			this.head = newNode;
		
		
		// if tail!=null, newNode is the current tail's next node
		if(this.tail != null) 
			this.tail.setNextNode(newNode);
		
		this.tail = newNode;
		
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
