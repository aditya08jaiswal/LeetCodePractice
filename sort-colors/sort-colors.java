class Solution {
    
    // -------------------------------------------------- //
    
    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    
    public int randomPartition(int[] nums, int start, int end) {
        
        Random rand = new Random(); 
        int pIndex = rand.nextInt(end-start)+start;
        swap(nums, pIndex, end);
        pIndex = partition(nums, start, end);
        return pIndex;
    }

    public int partition(int[] nums, int start, int end) {
        
        int pivot = nums[end];
        int pIndex = start;
        for (int i=start; i<end; i++) {
            if (nums[i] <= pivot) {
                swap(nums, i, pIndex);
                pIndex++;
            }
        }
        swap(nums, end, pIndex);
        return pIndex;
    }
    
    public void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int pIndex = randomPartition(nums, start, end);
            quickSort(nums, start, pIndex-1);
            quickSort(nums, pIndex+1, end);
        }
    }
    
    // -------------------------------------------------- //
    
    public void selectionSort(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            int i_min = i;
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i_min]>nums[j]) {
                    i_min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[i_min];
            nums[i_min] = temp;
        }
    }
    
    // -------------------------------------------------- //
    
    public void sortColors(int[] nums) {
        
        // -------------------------------------------------- //
        // Selection sort
        // selectionSort(nums);
        // -------------------------------------------------- //
        
        // -------------------------------------------------- //
        // Quick sort
        int size = nums.length;
        int start = 0, end = size-1;
        quickSort(nums, start, end);
        // -------------------------------------------------- //
        
    }
}