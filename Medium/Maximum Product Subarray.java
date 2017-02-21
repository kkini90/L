/*
Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.
*/
------------------------------------------------------------------------------------------------------------
public class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = nums[0], min = nums[0],result = nums[0];
        for(int i=1;i<nums.length;i++){
            int temp = max;
            max = Math.max(Math.max(max*nums[i],min*nums[i]),nums[i]);
            min = Math.min(Math.min(temp*nums[i],min*nums[i]),nums[i]);
            if(max > result){
                result = max;
            }
        }
        return result;
    }
}

//time : O(n)
//space: O(1)
/*
Loop through the array, each time remember the max and min value for the previous product, 
the most important thing is to update the max and min value: 
we have to compare among max * A[i], min * A[i] as well as A[i], since this is product, 
a negative * negative could be positive.
*/
