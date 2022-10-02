class Solution {
    
    public void merge(int[] numsL, int[] numsR, int[] nums) {
        int sizeL = numsL.length;
        int sizeR = numsR.length;
        // left, right and nums Pointer
        int lP=0, rP=0, nP=0;
        
        while(lP<sizeL && rP<sizeR) {
            if (numsL[lP] <= numsR[rP]) {
                nums[nP] = numsL[lP];
                lP++;
            } else {
                nums[nP] = numsR[rP];
                rP++;
            }
            nP++;
        }
        
        while(lP<sizeL) {
            nums[nP] = numsL[lP];
            lP++;
            nP++;
        }
        
        while(rP<sizeR) {
            nums[nP] = numsR[rP];
            rP++;
            nP++;
        }
    }

    public int[] sortArray(int[] nums) {
        
        int size = nums.length;
        
        if (size == 1) {
            return nums;
        }
        
        if (size < 2) {
            return null;
        }
        
        int mid = size/2;

        int[] numsL = new int[mid];
        int[] numsR = new int[size-mid];

        for (int i=0; i<mid; i++) {
            numsL[i] = nums[i];
        }
        for (int i=mid; i<size; i++) {
            numsR[i-mid] = nums[i];
        }

        sortArray(numsL);
        sortArray(numsR);
        merge(numsL, numsR, nums);

        return nums;
    }
}