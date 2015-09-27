package datastructures.linkedlist;

import datastructures.linkedlist.LinkedList.LLNode;

public class LinkedListCycle {

	public static boolean checkForCycle(LinkedList list) {
		LLNode fastPtr = list.head, slowPtr = list.head;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if(slowPtr == fastPtr) {
				return true;
			}			
		}
		return false;
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(5);
		
		linkedList.insert(10);
		linkedList.insert(15);
		linkedList.insert(10);
		linkedList.insert(5);
		linkedList.insert(10);
		LLNode temp = linkedList.head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		//temp.next = linkedList.head;
		
		System.out.println(checkForCycle(linkedList));

	}

}
