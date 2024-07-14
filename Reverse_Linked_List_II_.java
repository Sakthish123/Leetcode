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
    public ListNode reverse(ListNode head,int right){
        ListNode H=head;
        while(true){
          if(head==null)
            break;
          if(head.next==null)
            break;
          if(right==1)
            break;
          ListNode h=head.next;
          head.next=head.next.next;
          h.next=H;
          H=h;
          right--;
        }
        return H;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)
          return head;
        if(left==1)
          return reverse(head,right);
        ListNode H=head,h=head;
        while(left!=1){
            h=head;
            head=head.next;
            left--;
            right--;
        }
        head=reverse(head,right);
        h.next=head;
        return H;
    }
}
