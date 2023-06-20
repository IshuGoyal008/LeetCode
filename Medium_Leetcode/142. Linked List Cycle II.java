/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        return detect(head);
    }
     public int lengthCycle(ListNode head) {
	        ListNode fast=head;
	        ListNode slow=head;
	        while(fast!=null && fast.next!=null){
	            fast=fast.next.next;
	            slow=slow.next;
	            if(slow==fast){
	                ListNode temp=slow;
	                int length=0;
	                do {
	                	temp=temp.next;
	                	length++;
	                }
	                while(temp!=slow);
	                return length;
	            }
	        }
	        return 0;
	    }
	   public ListNode detect(ListNode head) {
		   int l=0;
		   ListNode fast=head;
		   ListNode slow=head;
		   
		   while(fast!=null && fast.next!=null) {
			   fast=fast.next.next;
			   slow=slow.next;
			   if(fast==slow) {
				   l=lengthCycle(slow);
				   break; 
			   }
		   }
		   if(l==0) {
			   return null;
		   }
		   
		   ListNode f=head;
		   ListNode s=head;
		   
		   while(l>0) {
			   s=s.next;
			   
			   l--;
		   }
		   
		     while(f!=s) {
		    	 f=f.next; 
		    	 s=s.next;
		     }
		     return s;
	   }
}
