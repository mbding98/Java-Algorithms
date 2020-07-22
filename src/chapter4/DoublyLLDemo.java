package chapter4;

public class DoublyLLDemo {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.insertAtHead(69);
		dll.insertAtHead(420);
		
		System.out.println(dll.toString());
	}

}
