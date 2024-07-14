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
    public int count(ListNode head){
        int c=0;
        while(true){
            if(head==null)
             break;
            c++;
        }
       return c;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t=l1;
        ListNode h=l1;
        int c=0;
        while(l2!=null){
            l1.val=l1.val+l2.val+c;
            if(l1.val>9){
                c=1;
                l1.val%=10;
            }
            else
             c=0;
            if(l1.next==null&&l2.next!=null){
                l1.next=l2.next;
                l2.next=null;
            }
            t=l1;
            l1=l1.next;
            l2=l2.next;
        }
        while(c!=0&&l1!=null){
            l1.val=l1.val+c;
            if(l1.val>9){
                c=1;
                l1.val%=10;
            }
            else
             c=0;
            t=l1;
            l1=l1.next;
        }
        if(c!=0&&l1==null){
            ListNode L=new ListNode(c,null);
            t.next=L;
        }
          
        return h;
    }
}
