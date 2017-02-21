/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
*/
------------------------------------------------------------------------------------------------
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 ==null || nums2==null || nums1.length==0 || nums2.length==0){
            return new int[0];
        }
        Set<Integer> numSet = new HashSet<Integer>();
        Set<Integer> intersect = new HashSet<Integer>();
        
        for(int num1 : nums1){
            numSet.add(num1);
        }
        
        for(int num2:nums2){
            if(numSet.contains(num2)){
                intersect.add(num2);
            }
        }
        int[] result = new int[intersect.size()];
        int i=0;
        for(int val: intersect){
            result[i++] = val;
        }
        return result;
    }
}
