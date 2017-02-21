/*
Sort a linked list in O(n log n) time using constant space complexity.
*/
------------------------------------------------------------------------------------
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if( head ==null || head.next ==null){
            return head;
        }
        
        //1.Cut the list into 2 halves
        ListNode slow = head, fast = head, prev = null;
        
        while(fast !=null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        
        //2.Sort each half
        ListNode list1 = sortList(head);
        ListNode list2 = sortList(slow);
        
        //3. Merge list1 and list2
        return merge(list1,list2);
    }
    
    private static ListNode merge(ListNode list1, ListNode list2){
        ListNode list = new ListNode(0), p = list;
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                p.next = list1;
                list1 = list1.next;
            }else{
               p.next = list2;
               list2 = list2.next; 
            }
            p = p.next;
        }
        if(list1 != null){
            p.next = list1;
        }
        if(list2 != null){
            p.next = list2;
        }
        return list.next;
    }
}
