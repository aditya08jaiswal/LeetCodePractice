class Solution {
    public int singleNonDuplicate(int[] nums) {
        for (int i=0; i<nums.length; i=i+2) {
            if (i+1 < nums.length && nums[i] != nums[i+1]) {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}