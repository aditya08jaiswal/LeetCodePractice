class Solution {
    
    public int sum(int n) {
        int total = 0;
        if (n>0) {
            total = n*(n+1)/2;
        }
        return total;
    }
    
    public int numIdenticalPairs(int[] nums) {
        
        int total = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        Set<Integer> keys = map.keySet();
        for (Integer key: keys) {
            total = total + sum(map.get(key)-1);
        }
        
        return total;
    }
}