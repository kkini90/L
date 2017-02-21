/*
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/
---------------------------------------------------------------------------------------------------------
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int res=0;
        if(n<=3){
            for(int num : nums){
                res+=num;
            }
            return res;
        }
        
        res = nums[0]+nums[1]+nums[2];
        for(int i=0;i<=n-3;i++){
            int j=i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum) <= Math.abs(target-res)){
                    res=sum;
                    if(res == target) return res;
                }
                if(sum>target) k--;
                else j++;
            }
        }
        return res;
    }
}

//Tc: nLogn + n^2
