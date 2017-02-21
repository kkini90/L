/*
Given a non-empty array of integers, return the k most frequent elements.

For example,
Given [1,1,1,2,2,3] and k = 2, return [1,2].

Note: 
You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
*/
------------------------------------------------------------------------
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        
        List list = new LinkedList(map.entrySet());
        
        Collections.sort(list, new Comparator(){
            public int compare(Object o1,Object o2){
                int cmp = ((Comparable)((Map.Entry)(o2)).getValue()).compareTo(((Map.Entry)(o1)).getValue());
                if(cmp !=0){
                    return cmp;
                }else{
                    return ((Comparable)((Map.Entry)(o2)).getKey()).compareTo(((Map.Entry)(o1)).getKey());
                }
            }
        });
        
        List<Integer> finalList = new LinkedList();
        int count =0;
        Iterator it = list.iterator();
        while(it.hasNext() && count!=k){
            Map.Entry entry = (Map.Entry)it.next();
            finalList.add((Integer)entry.getKey());
            count++;
        }
        
        return finalList;
    }
}
////Solution 1: Java Solution 1 - Using HashMap and Heap
//http://www.programcreek.com/2014/05/leetcode-top-k-frequent-elements-java/
///////////////////////////
//Solution 2:
/*
// use maxHeap. Put entry into maxHeap so we can always poll a number with largest frequency
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
           
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = 
                         new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }
        
        List<Integer> res = new ArrayList<>();
        while(res.size()<k){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }
        return res;
    }
}
*/

