class Solution {
    
    public int numIdenticalPairs(int[] nums) {
        
        int total = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 0);
            }
            total = total + map.get(nums[i]);
        }
        
        return total;
    }
}