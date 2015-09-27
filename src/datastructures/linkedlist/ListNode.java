package datastructures.linkedlist;

public class ListNode {
	public int val;
	public ListNode next;
	
	public ListNode(int x) { 
		val = x;
	}
	
	public void printList(ListNode head) {
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}
