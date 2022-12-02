class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> val = new HashMap<>();
        
        for (int i=0; i<nums.length; i++) {
            int item = target - nums[i];
            if (val.containsKey(item)) {
                int[] res = {val.get(item), i};
                return res;
            }
            val.put(nums[i], i);
        }
        return null;
    }
}