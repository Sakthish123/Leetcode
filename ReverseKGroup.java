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
    ListNode HEAD;
    public ListNode reverse(ListNode head,int k){
        ListNode H=head;
        for(int i=0;i<k;i++){
          ListNode h=head.next;
          head.next=head.next.next;
          h.next=H;
          H=h;
        }
        HEAD=head;
        return H;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode H=new ListNode(0,null),ans=H;
        ListNode st=head,en=head;
        int c=0;
        while(true){
            if(en==null){
                if(c==k){
                  H.next=reverse(st,k-1);
                  H=HEAD;
                }
                break;
            }
            if(c==k){
              H.next=reverse(st,k-1);
              H=HEAD;
              st=en;
              c=0;
            }
            en=en.next;
            c++;
        }
        return ans.next;
    }
}
