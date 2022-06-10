class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        int[] res = new int[l];
        
        for (int i=0; i<l; i++) {
            res[(i+k)%l] = nums[i];
        }
        
        for (int i=0; i<l; i++) {
            nums[i] = res[i];
        }
    }
}