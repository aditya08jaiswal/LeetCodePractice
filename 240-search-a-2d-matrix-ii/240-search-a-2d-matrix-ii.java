class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int maxCol = matrix[0].length;
        int maxRow = matrix.length;
        
        int r = 0;
        int c = maxCol-1;
        
        while(r<maxRow && c >= 0) {
            if (matrix[r][c]==target) {
                return true;
            }
            if (matrix[r][c]<target) {
                r++;
            } else {
                c--;
            }
        }
        
        return false;
    }
}