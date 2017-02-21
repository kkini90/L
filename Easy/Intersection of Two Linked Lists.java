/*
Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
*/
--------------------------------------------------------------------------------
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode current1 = headA;
        ListNode current2 = headB;
        if(current1==null || current2==null){
            return null;
        }
        
        int c1 = getCount(current1);
        int c2 = getCount(current2);
        
        if(c1>c2){
            int d = c1-c2;
            return getNode(d,current1,current2);
        }else{
            int d = c2-c1;
            return getNode(d,current2,current1);
        }
        
    }
    
    private static int getCount(ListNode current){
        int count =0;
        while(current!=null){
            count++;
            current= current.next;
        }
        return count;
    }
    
    private static ListNode getNode(int d,ListNode headA,ListNode headB){
        ListNode current1= headA;
        ListNode current2= headB;
        
        for(int i=0;i<d;i++){
            if(current1==null){
                return null;
            }
            current1= current1.next;
        }
        while(current1!=null && current2!=null){
            if(current1.val == current2.val){
                return current1;
            }
            current1=current1.next;
            current2=current2.next;
        }
        return null;
    }
}
