package code.stacks;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LC_2130_MaximumTwinSumLinkedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(4, l1);
		ListNode l3 = new ListNode(2, l2);
		ListNode listNode = new ListNode(1, l3);
		System.out.println(pairSum(listNode));
	}
	
	 public static int pairSum(ListNode head) {
	        List<Integer> list = new ArrayList<>();
	        ListNode curr = head;
	        
	        int maxSum = 0;
	        
	        while(curr != null) {
	            list.add(curr.val);
	            curr = curr.next;
	        }
	        
	        int n = list.size();
	        for(int i=0; i<= (n/2)-1; i++) {
	            int twin = n-1-i;
	            maxSum = Math.max(maxSum, (list.get(i) + list.get(twin)));
	        }
	        
	        return maxSum;
	    }

}
