/*
Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, 
with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.
*/
------------------------------------------------------------------------------------
public class Solution {
    //two pass
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){ count0++;}
            if(nums[i] == 1){ count1++;}
            if(nums[i] == 2){ count2++;}
        }
        
        for(int i=0;i<nums.length;i++){
            if(i<count0){
                nums[i] = 0;
            }else if(i<count0+count1){
                nums[i] = 1;
            }else{
                nums[i] = 2;
            }
        }
    }
}
/*
public void sortColors(int[] nums) {
    // 1-pass
    int p1 = 0, p2 = nums.length - 1, index = 0;
    while (index <= p2) {
        if (nums[index] == 0) {
            nums[index] = nums[p1];
            nums[p1] = 0;
            p1++;
        }
        if (nums[index] == 2) {
            nums[index] = nums[p2];
            nums[p2] = 2;
            p2--;
            index--;
        }
        index++;
    }
}*/
