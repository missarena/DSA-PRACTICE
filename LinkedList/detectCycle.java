
 //Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class detectCycle {

    public boolean hasCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast =head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
        
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast =head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                break;
            }
        }
        if (fast == null || fast.next == null) return null;

        // Step 2: Find the cycle's starting node
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

         return slow; // Start of the cycle
        //return fast; // both chale
        
        
    }
}