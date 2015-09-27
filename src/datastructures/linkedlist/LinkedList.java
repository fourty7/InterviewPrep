package datastructures.linkedlist;

public class LinkedList {
	LLNode head;
	
	public LinkedList(int data) {
		head = new LLNode(data);
		head.next = null;
	}

	class LLNode {
		int data;
		LLNode next; 
		
		public LLNode(int data) {
			this.data = data;
			this.next = null;
		}
	
		public LLNode(int data, LLNode next) {
			this(data);
			this.next = next;
		}
	}
	
	public void insert(int data) {
		//This method inserts the new element at the tail;
		LLNode current = head;
		while(current.next != null) {
			current = current.next;
		}		
		current.next = new LLNode(data);		
	}
	
	public void delete(int data) {
		LLNode current = head;
		LLNode prev = head;
		
		if(head.data == data) {
			if(head.next == null) {
				head=null;
			}
			else {
				head = head.next;
				//return;
			}
		}
		while(current != null) {
			if(current.data == data) {
				prev.next = current.next;
				current = current.next;
			}
			else {
				prev = current;
				current = current.next;
			}
		}
	}
	
	public LLNode findMiddle() {
		LLNode fastPtr = head;
		LLNode slowPtr = head;
		
		if(head == null){
			return null;
		}
		
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}
		return slowPtr;
	}
	
	public void reverse() {
		LLNode prev = null;
		LLNode current = head;
		LLNode next = current;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}		
		head = prev;
	}
	
	/*public void recursiveReverse(LLNode head) {
		if(head == null) {
			return;
		}
		
		LLNode first = head;
		LLNode next = head.next;
		
		if(next == null) {
			return;
		}
		
		first.next = null;
		recursiveReverse(next);
		first.next.next = first;		
		
		head = next;
	}*/
	
	
	
	public void printList() {
		LLNode current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	

	
	
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(5);
		
		//linkedList.insert(10);
		linkedList.insert(15);
		linkedList.insert(15);
		linkedList.insert(15);
		linkedList.insert(10);
		linkedList.insert(5);
		//linkedList.insert(10);
		//linkedList.printList();*/
		//linkedList.delete(5);
		
		linkedList.printList();
	}
	
}
