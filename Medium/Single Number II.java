/*
Given an array of integers, every element appears three times except for one, which appears exactly once. 
Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
------------------------------------------------------------------------------------------------
public class Solution {
    public int singleNumber(int[] nums) {
        int one =0,two=0;
        
        for(int i=0;i<nums.length;i++){
            one=one ^ nums[i] & ~ two;
            two=two ^ nums[i] & ~ one;
        }
        return one;
    }
}
