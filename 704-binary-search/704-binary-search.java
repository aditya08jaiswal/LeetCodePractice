class Solution {
    
    public int binarySearch(int[] nums, int start, int end, int target) {
        
        // Base condition
        if (start>end) return -1;
        
        // Stackoverflow error gets resolved
        int mid = start + (end-start) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            end = mid-1;
            return binarySearch(nums, start, end, target);
        } else {
            start = mid+1;
            return binarySearch(nums, start, end, target);
        }
    }

    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        
        int result = binarySearch(nums, start, end, target);
        return result;
    }
}