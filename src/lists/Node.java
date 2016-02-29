package lists;

public class Node {

	int cargo;
	Node next;
	
	public Node() {
		cargo = 0;
		next = null;
	}
	
	public Node (int cargo, Node next) {
		this.cargo = cargo;
		this.next = next;
	}
	
	public String toString() {
		return cargo + "";
	}

	public static void printList(Node list) {
		Node node = list;
		
		while(node != null) {
			System.out.print(node);
			node = node.next;
		}
		System.out.println();
	}
	
	public static void printBackward(Node list) {
		if(list == null) return;
		
		Node head = list;
		Node tail = list.next;
		
		printBackward(tail);
		System.out.print(head);
	}
	
	public static Node removeSecond(Node list) {
		Node first = list;
		Node second = list.next;
		
		//make the first node refer to the third
		first.next = second.next;
		
		//separate the second node from the rest of the list
		second.next = null;
		return second;
	}
	
	public static void printBackwardNicely(Node list) {
		System.out.print("(");
		
		if(list != null) {
			Node head = list;
			Node tail = list.next;
			printBackward(tail);
			System.out.print(head);
		}
		System.out.println(")");
	}
}
