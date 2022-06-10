class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] res = new int[nums.length];
        
        int j = 0; 
        int k = nums.length - 1;
        for(int i=nums.length-1; i>=0; i--) {
            if (Math.abs(nums[k]) > Math.abs(nums[j])) {
                res[i] = nums[k]*nums[k];
                k--;
            } else {
                res[i] = nums[j]*nums[j];
                j++;
            }
        }
        
        return res;
    }
}