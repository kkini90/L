/*
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.
*/
---------------------------------------------------------------------------
public class Solution {
    public int search(int[] nums, int target) {
       return search(nums,target,0,nums.length-1);
    }
    
    public int search(int[] nums,int target,int start,int end){
        
        int mid =(start+end)/2;
        if(nums[mid] == target){
            return mid;
        }
        
        if(start>end){
            return -1;
        }
        
        if(nums[start]<nums[mid]){
            if(nums[start]<=target && target<nums[mid]){
                return search(nums,target,start,mid-1);
            }else{
                return search(nums,target,mid+1,end);
            }
        }else if(nums[start]>nums[mid]){
            if(nums[mid] < target && target<=nums[end]){
                return search(nums,target,mid+1,end);
            }else{
                return search(nums,target,start,mid-1);
            }
        }else if(nums[start] == nums[mid]){
            if(nums[end]!=nums[mid]){
                return search(nums,target,mid+1,end);
            }else{
                int result = search(nums,target,start,mid-1);
                if(result==-1){
                    return search(nums,target,mid+1,end);
                }else{
                    return result;
                }
            }
        }
        return -1;
    }
}
