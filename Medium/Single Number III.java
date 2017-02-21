/*
Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
*/
------------------------------------------------------------------------
public class Solution {
    public int[] singleNumber(int[] nums) {
        int record =0;
        
        for(int num : nums){
            record ^= num;
        }
        record &= -record;
        
        int result[] = {0,0};
        
        for(int num : nums){
            if((num & record) == 0){
                result[0] ^= num;
            }else{
                result[1] ^= num;
            }
        }
        return result;
    }
}
/*
public int[] singleNumber(int[] nums) {
    int[] ans = new int[2];
    if(nums == null || nums.length <=1){
        return ans;
    }

    HashSet<Integer> record = new HashSet<Integer>();
    for(int i = 0;i<nums.length;i++){
        if(record.contains(nums[i])){
            record.remove(nums[i]);
        }
        else{
            record.add(nums[i]);
        }
    }
    Object[] test = record.toArray();
    ans[0]=(int)test[0];
    ans[1]=(int)test[1];
    return ans;
}
*/
