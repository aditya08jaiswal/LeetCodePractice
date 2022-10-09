class Solution {
    
    public int binary(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        
        while(low<high) {
            int mid = low + (high-low)/2;
            if (nums[mid]<nums[high]){
                high = mid;
            } else if (nums[mid]>nums[high]) {
                low = mid+1;
            } else {
                high--;
            }
        }
        
        return low;
    }
    public int findMin(int[] nums) {
        
        int low = binary(nums);
        return nums[low];
    }
}