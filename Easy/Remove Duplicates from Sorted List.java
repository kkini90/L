/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
*/
------------------------------------------------------------------------------------------------
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode  head) {
        ListNode current  = head;
        
        while(current!= null){
            ListNode runner = current;
            while(runner.next!=null){
                if(runner.next.val == current.val){
                    runner.next = runner.next.next;
                }else{
                    runner =runner.next;
                }
            }
            current = current.next;
        }
        return head;
    }
}
