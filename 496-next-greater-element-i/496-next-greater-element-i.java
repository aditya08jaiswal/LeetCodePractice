class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        for (int i=0; i<nums1.length; i++) {
            int max = -1;
            for (int j=nums2.length-1; j>=0; j--) {
                if (nums2[j] == nums1[i]) {
                    break;
                } else if (nums1[i] < nums2[j]) {
                    max = nums2[j];
                } else if (nums1[i] > nums2[j] && max != -1) {
                    continue;
                } else {
                    max = -1;
                }
            }
            
            nums1[i] = max;
        }
        
        return nums1;
    }
}