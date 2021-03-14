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
    
    public ListNode swapNodes(ListNode head, int k) {
        
       k=k-1;
       ListNode temp1 = head;
        while(k>0)
        {
            temp1 = temp1.next;
            k--;
        }
        
        ListNode x = temp1;
        ListNode temp2 = head;
        while(x.next != null)
        {
            temp2 = temp2.next;
            x=x.next;
        }
        int y = temp1.val;
        temp1.val = temp2.val;
        temp2.val = y;
        
        return head;
        
    }
}
