package chapter4;

public class LLDemo {
	public static void main (String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtHead(6);
		list.insertAtHead(9);
		list.insertAtHead(13);
		list.insertAtHead(5);
		list.insertAtHead(2);
		
		System.out.println(list);
		System.out.println("Length: " + list.length());
		
		list.deleteFromHead();
		
		System.out.println(list);
		System.out.println("Length: " + list.length());
		System.out.println("Found: " + list.search(13));
	}
}
