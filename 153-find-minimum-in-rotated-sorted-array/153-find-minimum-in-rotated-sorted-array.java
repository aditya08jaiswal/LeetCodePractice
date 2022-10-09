class Solution {
    public int findMin(int[] nums) {
        int minIndex = 0;
        
        for (int i=1; i<nums.length; i++) {
            if (nums[minIndex] > nums[i]) {
                minIndex = i;
            }
        }
        
        return nums[minIndex];
    }
}