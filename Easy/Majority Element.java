/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/
------------------------------------------------------------------------------------------------
public class Solution {
    public int majorityElement(int[] nums) {
        java.util.Arrays.sort(nums);
        int count =0;
        int len = nums.length;
        int majorElement =0;
        
        if(nums.length ==1){
            return nums[0];
        }
        int last = nums[0];
        for(int i=1;i<len;i++){
            if(last == nums[i]){
                count++;
                if(count>=len/2){
                    majorElement = last;
                }
            }else{
                last = nums[i];
                count =0;
            }
        }
        return majorElement;
    }
}
