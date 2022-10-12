class Solution {
    public boolean findSubarrays(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int i=1; i<nums.length; i++) {
            set.add(nums[i-1]+nums[i]);
        }
        
        if (set.size() != nums.length-1) {
            return true;
        }
        
        return false;
    }
}