package datastructures.linkedlist;

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null) {
			return null;
		}
		else if(l1 == null) {
			return l1;
		}
		else if(l2 == null) {
			return l2;
		}
		
		ListNode curr1 = l1;
		ListNode curr2 = l2;
		
		int sum=0;
		int carry = 0;
		
		ListNode dummy = new ListNode(sum);
		ListNode resultHead = dummy;
		
		while(curr1 != null && curr2 != null) {
			sum = curr1.val + curr2.val+carry;
			carry = sum/10;
			sum = sum%10;
			resultHead.next = new ListNode(sum);
			resultHead = resultHead.next;
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		
		while(curr1 != null) {
			sum = curr1.val + carry;
			carry = sum/10;
			sum = sum%10;
			resultHead.next = new ListNode(sum);
			resultHead = resultHead.next;
			curr1 = curr1.next;
		}
		
		while(curr2 != null) {
			sum = curr2.val + carry;
			carry = sum/10;
			sum = sum%10;
			resultHead.next = new ListNode(sum);
			resultHead = resultHead.next;
			curr2 = curr2.next;
		}
		
		if(carry == 1) {
			sum = carry;
			carry = sum/10;
			sum = sum%10;
			resultHead.next = new ListNode(sum);
			resultHead = resultHead.next;
		}
		
        return dummy.next;
}
	
	
	
	
	public static void main(String[] args) {
		AddTwoNumbers newProg = new AddTwoNumbers();
		
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		l2.next.next.next = new ListNode(7);
		
		ListNode result = newProg.addTwoNumbers(l1, l2);
		result.printList(result);
	}

}
