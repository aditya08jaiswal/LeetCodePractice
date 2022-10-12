class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        
        for (int i=0; i<nums1.length; i++) {
            set.add(nums1[i]);
        }
        
        for (int i=0; i<nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersection.add(nums2[i]);
            }
        }
        
        int[] res = new int[intersection.size()];
        Iterator it = intersection.iterator();
        
        int i = 0;
        while (it.hasNext()) {
            res[i] = (int)it.next();
            i++;
        }
        
        return res;
    }
}