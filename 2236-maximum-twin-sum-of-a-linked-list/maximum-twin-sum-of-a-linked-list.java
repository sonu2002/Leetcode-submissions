/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        
        
        ListNode fast=head;
        ListNode slow =head;
        
        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        slow=reverseNextHalf(slow);
        fast=head;
        int twinSum=Integer.MIN_VALUE;
        
       
        while(slow!=null){
         twinSum  = Math.max(slow.val + fast.val, twinSum);
            slow = slow.next;
            fast = fast.next;
        }
        
        return twinSum;
    }
    
    public ListNode reverseNextHalf(ListNode head){
        
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null ){
            ListNode nextPointer = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextPointer;
            
        }
        return prev;
    }
}