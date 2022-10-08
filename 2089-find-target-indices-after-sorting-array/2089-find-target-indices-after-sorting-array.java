class Solution {

    public int binarySearch(int[] nums, int target, boolean first) {
        int low = 0;
        int high = nums.length - 1;
        int result = -1;
        while (low<=high) {
            int mid = low + (high-low)/2;
            if (nums[mid] == target) {
                result = mid;
                if (first) high = mid - 1;
                else low = mid + 1;
            } 
            else if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return result;
    }
    
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> indices = new ArrayList<>();
        
        int low = 0;
        int high = nums.length - 1;

        int lowest = binarySearch(nums, target, true);
        int highest = binarySearch(nums, target, false);

        if (lowest != -1 && highest != -1) {
            for (int i=lowest; i<=highest; i++) {
                indices.add(i);
            }
        }

        return indices;
    }
}