class Solution {
    
    public int binarySearchLow(int[] nums, int low, int high, int target) {
        int lowest = -1;
        while (low<=high) {
            int mid = low + (high-low)/2;
            if (nums[mid] == target) {
                lowest = mid;
                high = mid - 1;
            } else if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return lowest;
    }
    
    public int binarySearchRight(int[] nums, int low, int high, int target) {
        int lowest = -1;
        while (low<=high) {
            int mid = low + (high-low)/2;
            if (nums[mid] == target) {
                lowest = mid;
                low = mid + 1;
            } else if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return lowest;
    }
    
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> indices = new ArrayList<>();
        
        int low = 0;
        int high = nums.length - 1;
        
        int lowest = binarySearchLow(nums, low, high, target);
        int highest = binarySearchRight(nums, low, high, target);
        
        if (lowest != -1 && highest != -1) {
            for (int i=lowest; i<=highest; i++) {
                indices.add(i);
            }
        }
        
        return indices;
    }
}