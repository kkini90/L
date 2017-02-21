/*
A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
*/
------------------------------------------------------------------------------------
public class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        
        while(low < high){
            int mid1 = (low+high)/2;
            int mid2 = mid1+1;
            if(nums[mid1] < nums[mid2]){
                low = mid2;
            }else{
                high = mid1;
            }
        }
        return low;
    }
}
/*
This problem is similar to Local Minimum. And according to the given condition, num[i] != num[i+1], there must exist a O(logN) solution. So we use binary search for this problem.

If num[i-1] < num[i] > num[i+1], then num[i] is peak
If num[i-1] < num[i] < num[i+1], then num[i+1...n-1] must contains a peak
If num[i-1] > num[i] > num[i+1], then num[0...i-1] must contains a peak
If num[i-1] > num[i] < num[i+1], then both sides have peak (n is num.length)
*/
/*class Solution {
public:

int findPeakElement(const vector<int> &num) {
    return Helper(num, 0, num.size()-1);
}
int Helper(const vector<int> &num, int low, int high)
{
    if(low == high)
        return low;
    else
    {
        int mid1 = (low+high)/2;
        int mid2 = mid1+1;
        if(num[mid1] > num[mid2])
            return Helper(num, low, mid1);
        else
            return Helper(num, mid2, high);
    }
}
};
*/
