/*
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
*/
----------------------------------------------------------------------------------------
public class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i: nums){
            if(!set.contains(i)){
                set.add(i);
                pq.offer(i);
                if(pq.size()>3){ // if pq has more than 3 elements, remove it and maintain only 3 elements
                    set.remove(pq.poll());
                }
            }
        }
        if(pq.size()<4){          // if pq has 3 elements remove 2 elemnts to access third max elemnt
            while(pq.size()>1){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
//TC: O(log n) + O(1)
//eg: 1 2 3 4 5 6 7 -> 5 6 7 - ans: 7
