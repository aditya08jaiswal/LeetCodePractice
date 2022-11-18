class Solution {
    public int mySqrt(int x) {
        
        int start = 1;
        int end = x;
        int sqrt = 0;
        
        while (start <= end) {
            int mid = start + (end-start)/2;
            
            if (mid > x/mid) {
                end = mid-1;
            } else {
                start = mid+1;
                sqrt = mid;
            }
        }
        
        return sqrt;
    }
}