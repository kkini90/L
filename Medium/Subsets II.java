/*
Given a collection of integers that might contain duplicates, nums, return all possible subsets.

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
*/
------------------------------------------------------------------------------------------------
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //Use the Set to remove the duplicate lists
        HashSet<List<Integer>> res = new HashSet<>();
        res.add(new ArrayList<>());
        Arrays.sort(nums);
        
        for(int i : nums){
            List<List<Integer>> temp = new ArrayList<>();
            for(List<Integer> sub : res){
                List<Integer> a = new ArrayList<>(sub);
                a.add(i);
                temp.add(a);
            }
            res.addAll(temp);
        }
        List<List<Integer>> list = new ArrayList<>(res);
        return list;
    }
}
