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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode H=new ListNode(0,null),H1=H;
        int n=lists.length;
        while(true){
        int v=10000,f=-1;
        for(int i=0;i<n;i++){
            if(lists[i]!=null){
              if(lists[i].val<v){
                v=lists[i].val;
                f=i;
              }
            }
        }
        if(f==-1)
          break;
        lists[f]=lists[f].next;
        ListNode h=new ListNode(v,null);
        H.next=h;
        H=H.next;
        }
        return H1.next;
    }
}
