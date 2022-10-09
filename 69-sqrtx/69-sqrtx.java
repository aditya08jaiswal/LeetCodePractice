class Solution {
    public int mySqrt(int x) {
        
        int ans = 0;
        int low = 1;
        int high = x;
        while (low<=high) {
            int mid = low + (high-low)/2;
            
            if (mid>x/mid) {
                high = mid-1;
            } else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}