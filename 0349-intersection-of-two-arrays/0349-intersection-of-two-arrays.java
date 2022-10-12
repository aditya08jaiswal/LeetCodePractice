class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> intersection = new HashSet<>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        for (int i=0; i<nums1.length; i++) {
            // Binary Search on each element
            int low = 0;
            int high = nums2.length-1;
            while(low<=high) {
                int mid = low + (high-low)/2;
                if (nums2[mid] == nums1[i]) {
                    intersection.add(nums2[mid]);
                    break;
                } else if (nums2[mid] > nums1[i]) {
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            }
        }
        
        int[] res = new int[intersection.size()];
        
        int j = 0;
        for (int i: intersection) {
            res[j++] = i;
        }
        
        return res;
    }
}