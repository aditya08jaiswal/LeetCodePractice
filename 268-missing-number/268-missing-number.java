class Solution {
    public int total(int n) {
        int sum = (n*(n+1))/2;
        return sum;
    }
    public int missingNumber(int[] nums) {
        
        int sum = 0;
        int n = nums.length;
        boolean isZero = false;
        
        for (int i=0; i<n; i++) {
            if (nums[i] == 0) {
                isZero = true;
            }
            sum = sum + nums[i];
        }
        
        if (!isZero) {
            return 0;
        }
        
        int missing = total(n)-sum;
        
        return missing;
    }
}