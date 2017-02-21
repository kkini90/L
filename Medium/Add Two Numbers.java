/*
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/
------------------------------------------------------------------------------------------------------------
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1,l2,0);
    }
    
    ListNode addTwoNumbers(ListNode l1, ListNode l2,int carry){
        if(l1==null && l2==null && carry==0){
            return null;
        }
        
        int value = carry;
        
        if(l1!=null){
            value+=l1.val;
        }
        
        if(l2!=null){
            value+=l2.val;
        }
        
        
        ListNode result = new ListNode(value%10);
        
        if(l1!=null || l2!=null){
            ListNode more = addTwoNumbers(l1 ==null ? null : l1.next,l2 ==null ? null : l2.next,value>=10?1:0);
            result.next = more ;
        }
        
        return result;
        
    }
    
}
