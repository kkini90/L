/*
Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        Stack<ListNode> stack = new Stack<ListNode>();
        
        while(fast != null && fast.next != null){
            stack.push(slow);
            slow = slow.next;
            fast= fast.next.next;
        }
        
        if(fast != null){
            slow = slow.next;
        }
        
        while(slow != null){
            int top = stack.pop().val;
            if(top != slow.val){
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
