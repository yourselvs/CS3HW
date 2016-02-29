package lists;
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
		int pos = 0;
		do{
			if(pos == i - 1){
				Node newNode = new Node();
				newNode.cargo = cargo;
				newNode.next = node.next;
				node.next = newNode;
				break;
			}
			node = node.next;
			pos++;
		}while(node.next != null);
	}
	
	public void addLast(int cargo){
		Node node = head;
		while(node.next != null){
			node = node.next;
		}
		node.next = new Node();
		node.next.cargo = cargo;
	}
	
	public void reverse(){
		Node list = head;
		head = new Node();
		
		reverseList(list);
		head = head.next;
	}
	
	private void reverseList(Node list){
		if(list == null) return;
		
		Node head = list;
		Node tail = list.next;
		
		reverseList(tail);
		addLast(head.cargo);
	}
	
	public void append(IntList intList){
		Node list = intList.head;
		while(list.next != null){
			addLast(list.cargo);
			list = list.next;
		}
		addLast(list.cargo);
	}
	
	public boolean checkLength(int length){
		if(length == this.length)
			return true;
		return false;
	}
	
	public String buildString(IntList list){
		String builtNum = "";
		Node node = list.head;
		
		while(node != null) {
			builtNum = builtNum + node.cargo;
			node = node.next;
		}
		
		return builtNum;
	}
	
	public int compare(IntList list1, IntList list2){
		int num1 = Integer.parseInt(buildString(list1));
		int num2 = Integer.parseInt(buildString(list2));
		
		if(num1 > num2)
			return 1;
		else if(num2 > num1)
			return -1;
		else
			return 0;
	}
}
