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
    
    public ListNode reverseList(ListNode head) {
        ListNode H=head;
        while(true){
          if(head==null)
            break;
          if(head.next==null)
            break;
          ListNode h=head.next;
          head.next=head.next.next;
          h.next=H;
          H=h;
        }
        return H;
    }
}
