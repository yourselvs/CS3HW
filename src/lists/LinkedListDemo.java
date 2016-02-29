package lists;
public class LinkedListDemo {
	public static void main(String[] args) {
		IntList list = new IntList();
		for(int i = 0; i < 9; i++) {
			list.addFirst(i + 1);
		}
		
		System.out.println("Printed:");
		Node.printList(list.head);
		System.out.println();
		
//		System.out.println("Printed backwards:");
//		list.printBackward();
//		System.out.println();
//
//		list.removeFirst();
//		System.out.println("First removed:");
//		Node.printList(list.head);
//		System.out.println();
//		
//		list.set(4, 9);
//		System.out.println("Set position \"4\" to cargo \"9\":");
//		Node.printList(list.head);
//		System.out.println();
//		
//		list.add(2, 8);
//		System.out.println("Added node at position \"2\" with cargo \"8\":");
//		Node.printList(list.head);
//		System.out.println();
//		
//		list.addLast(5);
//		System.out.println("Added node at last position with cargo \"5\":");
//		Node.printList(list.head);
//		System.out.println();
//		
//		list.reverse();
//		System.out.println("Reversed list:");
//		Node.printList(list.head);
//		System.out.println();
//		
//		IntList appendList = new IntList();
//		for(int i = 0; i < 9; i++) {
//			appendList.addFirst(i + 1);
//		}
//		list.append(appendList);
//		System.out.println("Added a list of 9-1 onto the current list:");
//		Node.printList(list.head);
//		System.out.println();
	}
}
