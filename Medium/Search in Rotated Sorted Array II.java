/*
Follow up for "Search in Rotated Sorted Array":
What if duplicates are allowed?

Would this affect the run-time complexity? How and why?
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Write a function to determine if a given target is in the array.

The array may contain duplicates.
*/
---------------------------------------------------------------------------
public class Solution {
    public boolean search(int[] nums, int target) {
        return search(nums,0,nums.length-1,target);
    }
    
    boolean search(int[] nums,int left,int right,int target){
        if(left>right) return false;
        
        int mid = (left+right)/2;
        
        if(nums[mid] == target){
            return true;
        }
        
        if(nums[mid] > nums[left]){
            if(nums[left] <= target && target<nums[mid]){
                return search(nums,left,mid-1,target);
            }else{
                return search(nums,mid+1,right,target);
            }
        }else if(nums[mid] < nums[left]){
            if(nums[mid] < target && target <= nums[right]){
                return search(nums,mid+1,right,target);
            }else{
                return search(nums,left,mid-1,target);
            }
        }else if(nums[left] == nums[mid]){
            if(nums[mid] != nums[right]){
                return search(nums,mid+1,right,target);
            }else{
                boolean result = search(nums,left,mid-1,target);
                if(result == false){
                    return search(nums,mid+1,right,target);
                }else{
                    return result;
                }
            }
        }
        
        return false;
    }
}
