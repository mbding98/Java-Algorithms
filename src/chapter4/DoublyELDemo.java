package chapter4;

public class DoublyELDemo {
	public static void main(String[] args) {
		DoublyEndedList dll = new DoublyEndedList();
		
		dll.insertAtTail(1);
		dll.insertAtTail(5);
		dll.insertAtTail(69);
		
		System.out.println(dll.toString());
	}
}
