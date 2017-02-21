/*
Given a set of distinct integers, nums, return all possible subsets.

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
*/
------------------------------------------------------------------------------------
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        
        Arrays.sort(nums);
        
        for(int i : nums){
            List<List<Integer>> tmp = new ArrayList<>();
            for(List<Integer> sub : res){
                List<Integer> a = new ArrayList<>(sub);
                a.add(i);
                tmp.add(a);
            }
            res.addAll(tmp);
        }
        return res;
    }
}
/*
Intuitively, we are still generating all 2^n possible subsets (where n = |S| ) so the complexity will be at least 2^n.

As for the code, initially in the outer for loop iterating over S, "res" only contains 1 subset, the empty set, []. We iterate over it in the inner loop and add a new subset, the subset containing the first element, [s0] (without loss of generality).

In the next iteration of the outer loop, there are now 2 subsets in "res": [] and [s0]. We iterate over both of these, appending the 2nd element of S to each and add two additional subsets, [s1] and [s0, s1]. Thus res now has 4 subsets, [], [s0], [s1], [s0, s1].

You can now see that for each iteration of the outer loop, the number of subsets we iterate over in the inner loop doubles, giving us the exponential complexity.
*/
