class Solution {
    
    public boolean isEven(int n) {
        if (n%2 == 0) {
            return true;
        }
        return false;
    }
    
    public int singleNonDuplicate(int[] nums) {

        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int result = -1;
        
        
        if (n == 1) {
            return nums[0];
        } 
        
        //If the first element is the single element, return it
        if(nums[0] != nums[1]) return nums[0];
        
		//If the last element is the single element, return it
        if(nums[n - 1] != nums[n - 2]) return nums[n - 1];
        
        while (low <= high) {
            int mid = low + (high-low)/2;
            
            if (nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]) {
                result = nums[mid];
                break;
            } else if (nums[mid-1] == nums[mid]) {
                if (isEven(mid)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] == nums[mid+1]) {
                if (isEven(mid)) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        
        return result;
    }
}