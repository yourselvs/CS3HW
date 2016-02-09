package homework;
public class IntList {
	int length;
	Node head;
	
	public IntList() {
		length = 0;
		head = null;
	}
	
	public void printBackward() {
		if(head != null) {
			Node tail = head.next;
			Node.printBackward(tail);
			System.out.print(head);
		}
		System.out.println();
	}

	public void addFirst(int i) {
		Node node = new Node (i, head);
		head = node;
		length++;
	}
	
	public int removeFirst() {
		int cargo = head.cargo;
		head = head.next;
		return cargo;
	}
	
	public void set(int i, int cargo){
		Node node = head;
		int pos = 0;
		while(node.next != null){
			if(pos == i){
				node.cargo = cargo;
				break;
			}
			node = node.next;
			pos++;
		}
	}
	
	public void add(int i, int cargo){
		Node node = head;
		if(i == 0){
			Node newNode = new Node(cargo, node);
			head = newNode;
		}
		else{
			int pos = 0;
			while(node.next != null){
				if(pos == i - 1){
					Node newNode = new Node();
					newNode.cargo = cargo;
					newNode.next = node.next;
					node.next = newNode;
				}
				node = node.next;
				pos++;
			}
		}
	}
}
