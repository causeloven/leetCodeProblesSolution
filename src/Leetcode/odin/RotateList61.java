package Leetcode.odin;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 class RotateList61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        ListNode tail = head;
        int length = 1;

        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        tail.next = head;

        k = k % length;
        if(k == 0){
            tail.next = null;
            return head;
        }

        int steps = length - k;
        for(int i = 0; i < steps; i++){
            tail = tail.next;
        }

        head = tail.next;
        tail.next = null;

        return head;
    }
}
