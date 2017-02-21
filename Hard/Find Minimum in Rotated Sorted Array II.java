/*
Follow up for "Find Minimum in Rotated Sorted Array":
What if duplicates are allowed?
Would this affect the run-time complexity? How and why?
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
Find the minimum element.
The array may contain duplicates.
*/
------------------------------------------------------------------------------------------
public class Solution {
    public int findMin(int[] nums) {
        return findMin(nums,0,nums.length-1);
    }
    
    private int findMin(int[] nums,int start,int end){
        if(start == end){
            return nums[start];
        }
        if(end - start ==1){
            return Math.min(nums[start],nums[end]);
        }
        
        int mid = (start+end)/2;
        
        if(nums[start]<nums[end]){
            return nums[start];
        }else if(nums[mid]>nums[start]){
            return findMin(nums,mid,end);
        }else if(nums[mid]<nums[start]){
            return findMin(nums,start,mid);
        }else if(nums[mid]==nums[start] || nums[mid]==nums[end]){
            int min1= findMin(nums,mid,end);
            int min2 = findMin(nums,start,mid);
            return Math.min(min1,min2);
        }
        return -1;
    }
}
/*
This is a follow-up problem of finding minimum element in rotated sorted array without duplicate elements. 
We only need to add one more condition, which checks if the left-most element and the right-most element are equal.
If they are we can simply drop one of them. 
In my solution below, I drop the left element whenever the left-most equals to the right-most.
public int findMin(int[] num) {
    return findMin(num, 0, num.length-1);
}
 
public int findMin(int[] num, int left, int right){
    if(right==left){
        return num[left];
    }
    if(right == left +1){
        return Math.min(num[left], num[right]);
    }
    // 3 3 1 3 3 3
 
    int middle = (right-left)/2 + left;
    // already sorted
    if(num[right] > num[left]){
        return num[left];
    //right shift one
    }else if(num[right] == num[left]){
        return findMin(num, left+1, right);
    //go right    
    }else if(num[middle] >= num[left]){
        return findMin(num, middle, right);
    //go left    
    }else{
        return findMin(num, left, middle);
    }
}
*/
