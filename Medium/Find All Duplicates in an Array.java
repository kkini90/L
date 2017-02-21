/*
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]
*/
------------------------------------------------------------------------
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return result;
        }
        int len = nums.length;
        boolean[] flag = new boolean[len+1];
        
        for(int i=0;i<len;i++){
            if(!flag[nums[i]]){
                flag[nums[i]] = true;
            }else{
                result.add(nums[i]);
            }
        }
        return result;
    }
}
