/*
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
*/
--------------------------------------------------------------------------------
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head ==null){
              return null;
          }
        // val 6 
        //case 1: 6->6->null
        while(head.val == val){
            head = head.next;
            if(head == null){
                return head;
            }
        }
        
        //case 2 3->6->2
        ListNode prev = head;
        while(prev.next != null){
            if(prev.next.val == val){
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return head;
        
    }
}

