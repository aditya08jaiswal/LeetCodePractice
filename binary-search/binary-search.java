class Solution {
    
    public int binarySearch(int[] nums, int left, int right, int target) {
        
        if (right < left) {
            return -1;
        }
        
        int mid = left + (right-left) / 2;
        
        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return binarySearch(nums, mid+1, right, target);
        } else {
            return binarySearch(nums, left, mid-1, target);
        }
    }
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        
        int result = binarySearch(nums, left, right, target);
        
        return result;
        
    }
}