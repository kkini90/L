/*
You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.
For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
*/

------------------------------------------------------------------------------------------------
public class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int result =0;
        for(int i=0;i<n;i++){
            result ^=nums[i];
        }
        return result;
    }
}

/*
public class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num) +1);
            }else{
                map.put(num,1);
            }
        }
        
        for(int num : nums){
            if(map.get(num) ==1){
                return num;
            }
        }
        return -1;
    }
}
*/
