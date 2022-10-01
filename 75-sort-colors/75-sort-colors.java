class Solution {
    public void sortColors(int[] nums) {
        // Selection sort
        for (int i=0; i<nums.length; i++) {
            int i_min = i;
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i_min]>nums[j]) {
                    i_min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[i_min];
            nums[i_min] = temp;
        }
    }
}