/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all 
elements into the memory at once?
*/
------------------------------------------------------------------------------------------------
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        if(nums1.length == 0 || nums2.length == 0 || nums1==null ||nums2==null){
            return new int[0];
        }
        Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        
        for(int num1: nums1){
            if(hashMap.containsKey(num1)){
                hashMap.put(num1,hashMap.get(num1)+1);
            }else{
                hashMap.put(num1,1);
            }
        }

        List<Integer> list = new ArrayList<Integer>();
        int i=0;
        
        for(int num2:nums2){
            if(hashMap.containsKey(num2) && hashMap.get(num2)>0){
                hashMap.put(num2,hashMap.get(num2)-1);
                list.add(num2);
            }
        }
        int[] result = new int[list.size()];
        for(int j=0;j<list.size();j++){
            result[j] = list.get(j);
        }
        return result;
    }
}
