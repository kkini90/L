/*
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/
------------------------------------------------------------------------------------------
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> mainList = new ArrayList<>();
        if(nums ==null || nums.length<3){
            return mainList;
        }
        //First sort the array
        java.util.Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]) continue; // Skip same results
            int j = i+1;
            int k = nums.length-1;
            int target = 0 - nums[i];//b+c=-a
            
            while(j<k){
                if(nums[j] + nums[k] == target){
                    mainList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j < k && nums[j] == nums[j + 1]) j++;  // Skip same results
                    while(j < k && nums[k] == nums[k - 1]) k--;  // Skip same results
                    j++; k--;
                }else if(nums[j] + nums[k] > target){
                // no match. 
                // if sum is too big, decrement k
                // if sum is too small, increment j
                    k--;
                }else{
                    j++;
                }
            }
        }
        return mainList;
    }
}
//https://discuss.leetcode.com/topic/28857/easiest-java-solution
// variation https://www.careercup.com/question?id=16021672
