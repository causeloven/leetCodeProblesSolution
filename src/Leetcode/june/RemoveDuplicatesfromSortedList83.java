package Leetcode.june;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class RemoveDuplicatesfromSortedList83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head != null){
            ListNode current = head;
            while(current != null && current.next != null){
                if(current.val == current.next.val){
                    current.next = current.next.next;
                }else{
                    current = current.next;
                }
            }
        }else {
            return null;
        }

        return head;

    }
}
