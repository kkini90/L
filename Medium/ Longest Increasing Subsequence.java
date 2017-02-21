/*
Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. 
Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.

Follow up: Could you improve it to O(n log n) time complexity?
*/
------------------------------------------------------------------------------------
public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums== null || nums.length==0){
            return 0;
        }
        List<Integer> seq = new ArrayList<Integer>();
        for(int n : nums){ // for each n in nums call update()
            update(seq,n);
        }
        return seq.size();
    }
    
    public void update(List<Integer> seq,int n){
        if(seq.isEmpty() || seq.get(seq.size()-1) < n){ //keep adding until increasing seq
            seq.add(n);
        }else{
            seq.set(findFirstLargeEqual(seq,n),n); //set largest value in seq with n
        }
    }
    
    public int findFirstLargeEqual(List<Integer> seq, int target){
        int low = 0;
        int high = seq.size()-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(seq.get(mid) < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
}

//TC : nlogn
