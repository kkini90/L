/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
*/
------------------------------------------------------------------------------------------------
public class Solution {
    public int maxSubArray(int[] nums) {
        int newSum = nums[0];
        int max = nums[0];
        
        for(int i=1;i<nums.length;i++){
            newSum = Math.max(newSum+nums[i],nums[i]);
            max = Math.max(max,newSum);
        }
        return max;
      }
    }

/*

public int maxSubArray(int[] nums) {
        int maxSum=-1;
        int sum=0;
        if(nums.length==0){
            return 0;
        }
           
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxSum){
                maxSum = sum;
            }else if(sum<0){
                sum=0;
                }
            }
            return maxSum;
        }

*/
