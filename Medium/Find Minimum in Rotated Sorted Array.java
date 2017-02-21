/*
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
*/
------------------------------------------------------------------------------------------------
public class Solution {
    public int findMin(int[] nums) {
        return findMin(nums,0,nums.length-1);
        
    }
    
    int findMin(int[] nums,int start,int end){
        if(start == end){
            return nums[start];
        }
        if(end-start == 1){
            return Math.min(nums[start],nums[end]);
        }
        
        int mid =(start+end)/2;
        
        if(nums[start] < nums[end]){
            return nums[start];
        }else if(nums[mid]>nums[start]){
            return findMin(nums,mid,end);
        }else{
            return findMin(nums,start,mid);
        }
    }
}
