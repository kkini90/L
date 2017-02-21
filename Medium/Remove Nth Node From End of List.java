/*
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
*/
---------------------------------------------------------------------------
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head ==null){
            return head;
        }
        ListNode p1  = head;
        ListNode p2  = head;
        
        for(int i=0;i<n;i++){
            p1=p1.next;
        }
        //if remove the first node
        if(p1==null){
            head = head.next;
            return head;
        }
        ListNode temp =null;
        while(p1!=null){
            p1=p1.next;
            temp = p2;
            p2=p2.next;
        }
       temp.next = p2.next;
       return head;
    }
}
