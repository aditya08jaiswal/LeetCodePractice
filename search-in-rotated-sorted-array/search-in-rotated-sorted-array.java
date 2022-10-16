class Solution {

    public int binarySearch(int[] nums, int target) {
        
        int n = nums.length-1;
        int low = 0;
        int high = n;
        
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (nums[mid] == target) {
                return mid;
            }
            
            // Left sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } 
            // Right sorted
            else if (nums[mid] <= nums[high]) {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        
        return -1;
    }
    public int search(int[] nums, int target) {

        int result = binarySearch(nums, target);
        return result;
    }
}