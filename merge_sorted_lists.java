class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode H=new ListNode(0,null),H1=H;
        while(true){
        int v;
        if(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                v=list1.val;
                list1=list1.next;
            }
            else{
                v=list2.val;
                list2=list2.next;
            }
        }
        else if(list1==null&&list2!=null){
           v=list2.val;
           list2=list2.next;
        }
        else if(list1!=null&&list2==null){
           v=list1.val;
           list1=list1.next;
        }
        else
           break;
        ListNode h=new ListNode(v,null);
        H.next=h;
        H=H.next;
        }
        return H1.next;
    }
}
