//	QUE5

public class List {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public List() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	

	 void insertSorted(int data) {
	        Node newnode = new Node(data);
	        if (isEmpty()) {
	            head = newnode;
	            tail = newnode; 
	        } 
	        else if (head.data >= newnode.data) {
	            newnode.next = head;
	            head = newnode;
	        } 
	        else {
	            Node current = head;
	            while (current.next != null && current.next.data < newnode.data) {
	                current = current.next;
	            }
	            newnode.next = current.next;
	            current.next = newnode;
	        }
	        if (newnode.next == null) {
	            tail = newnode;
	        }
	    }

	
	public void delFirst() {
		if(isEmpty())
			return;
		else if(head == tail)
			 head = null;
		else
			head = head.next;
	}
	
	public void delLast() {
		if(isEmpty())
			return;
		else if(head == tail)
			head = tail = null;
		else {
			Node trav = head;
			while( trav.next != tail) {
				trav = trav.next;
			}
				trav.next = null;
				tail = trav;
		}
		
	}
	
	public void display() {
		Node trav = head;
		System.out.print("List : ");
		while(trav != null){
			System.out.print(" "+trav.data);
			trav = trav.next;
			
			
		}
		System.out.print("");
	}
	
	

}
