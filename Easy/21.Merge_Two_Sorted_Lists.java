class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
          ListNode dummy=new ListNode();
          ListNode temp=dummy;

          while(list1!=null && list2!=null){
              if(list1.val<list2.val){
                  dummy.next=list1;
                  list1=list1.next;
                  dummy=dummy.next;
              }
                else{
                     dummy.next=list2;
                  list2=list2.next;
                  dummy=dummy.next;
                }
          }
          if(list1==null){
              dummy.next=list2;
          }
          if(list2==null){
              dummy.next=list1;
          }

      return temp.next;
    }
}
